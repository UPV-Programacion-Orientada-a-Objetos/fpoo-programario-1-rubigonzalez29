package edu.upvictoria.fpoo.ProblemaCatorce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProblemaCatorce{


    public void problema14() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        String año_actual, año_born;

        System.out.println("Introduce tu fecha de nacimiento:");
        entrada = bufer.readLine();
        año_born = entrada;

        LocalDate fecha_actual = LocalDate.now();

        LocalDate fecha_born= LocalDate.parse(año_born, DateTimeFormatter.ISO_LOCAL_DATE);
        Period interseccion_fechas = Period.between(fecha_actual, fecha_born);
        int edad = Math.abs(interseccion_fechas.getYears());

        System.out.println("Tienes" +edad +" anios");

    }
}
