package edu.upvictoria.fpoo.ProblemaDiecinueve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiecinueve{

    public void practica19() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double velocidad, distancia, tiempo;

        System.out.println("Introduce la velocidad: ");
        entrada = bufer.readLine();
        velocidad = Double.parseDouble(entrada);

        System.out.println("Introduce la distancia: ");
        entrada = bufer.readLine();
        distancia = Double.parseDouble(entrada);

        tiempo = distancia/velocidad;

        System.out.println("El tiempo de la distancia recorrida es: " + tiempo);

    }
}
