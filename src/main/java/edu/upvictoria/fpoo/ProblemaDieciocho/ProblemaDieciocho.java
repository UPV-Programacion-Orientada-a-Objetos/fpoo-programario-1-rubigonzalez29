package edu.upvictoria.fpoo.ProblemaDieciocho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaDieciocho {


    public void practica18() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double total, km, costo_km;

        System.out.println("Introducd la cantidad de Kilomeros a recorrer: ");
        entrada = bufer.readLine();
        km = Double.parseDouble(entrada);

        System.out.println("Introduce el costo de los kilometros ");
        entrada = bufer.readLine();
        costo_km = Double.parseDouble(entrada);

        total = km*costo_km;

        System.out.println("El costo del boleto es: "+ total);
    }
}
