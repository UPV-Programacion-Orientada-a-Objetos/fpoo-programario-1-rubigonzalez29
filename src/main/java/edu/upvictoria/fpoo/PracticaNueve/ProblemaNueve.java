package edu.upvictoria.fpoo.PracticaNueve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaNueve {

    public void problema9() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double horas_trabajadas, sueldo_baseHOras, dias_trabajados, total;

        System.out.println("Introduce las horras trabajadas al dia: ");
        entrada = bufer.readLine();
        horas_trabajadas = Double.parseDouble(entrada);

        System.out.println("Introduce el salario base por hora: ");
        entrada = bufer.readLine();
        sueldo_baseHOras = Double.parseDouble(entrada);


        System.out.println("Introduce la cantidad de dias trabajados: ");
        entrada = bufer.readLine();
        dias_trabajados = Double.parseDouble(entrada);


        total = ((horas_trabajadas * sueldo_baseHOras) * dias_trabajados);

        System.out.println("El sueldo base por semana es: " + total);


    }
}

