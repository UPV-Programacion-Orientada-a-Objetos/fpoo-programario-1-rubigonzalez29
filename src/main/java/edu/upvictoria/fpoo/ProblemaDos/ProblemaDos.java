package edu.upvictoria.fpoo.ProblemaDos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDos {

    public void problema2() throws IOException {
        double calificaciones = 0, promedio=4;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;


        System.out.println("Introduce la calificacion obtenida en los cuatro examenes realizados: ");
        entrada = bufer.readLine();
        calificaciones = Double.parseDouble(entrada);

        promedio = ((calificaciones*promedio)/promedio);

        System.out.println("Promedio: " +promedio);

    }

}