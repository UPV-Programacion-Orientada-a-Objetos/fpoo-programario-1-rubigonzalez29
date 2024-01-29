package edu.upvictoria.fpoo.ProblemaOnce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaOnce {
    public void problema11() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double largo, ancho, profundidad, litros_cubicos, metros_cubicos, total;

        System.out.println("Introduce el largo de la alberca:  ");
        entrada = bufer.readLine();
        largo = Double.parseDouble(entrada);

        System.out.println("Introduce el ancho de la alberca:  ");
        entrada = bufer.readLine();
        ancho = Double.parseDouble(entrada);

        System.out.println("Introduce la profundidad de la alberca:  ");
        entrada = bufer.readLine();
        profundidad = Double.parseDouble(entrada);

        metros_cubicos= (largo*ancho*profundidad);
        litros_cubicos= (largo*ancho*profundidad) * 1000;

        System.out.println("La cantidad de metros cubicos de agua es: " + metros_cubicos);
        System.out.println("La cantidad de litros cubicos de agua es: " + litros_cubicos);

        total=(metros_cubicos*100);

        System.out.println("CANTIDAD A PAGAR:  " + total);

    }
}
