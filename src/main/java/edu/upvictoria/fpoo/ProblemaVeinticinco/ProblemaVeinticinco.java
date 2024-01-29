package edu.upvictoria.fpoo.ProblemaVeinticinco;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeinticinco {

    public void problema25() throws IOException {
        double hotel, comida, otrosGastos, total;
        int dias;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Introducee el numero de dias que estara:");
        entrada = bufer.readLine();
        dias = Integer.parseInt(entrada);

        System.out.println("Introduce el costo diario del hotel:");
        entrada = bufer.readLine();
        hotel = Double.parseDouble(entrada);

        System.out.println("Introduce el costo de la comida:");
        entrada = bufer.readLine();
        comida = Double.parseDouble(entrada);

        otrosGastos = 100.00;
        total = (hotel + comida + otrosGastos) * dias;

        System.out.println("Monto total:");
        System.out.println("La cantidad a pagar por el hotel es: $" + (hotel * dias));
        System.out.println("a cantidad a pagar por la comida es: $" + (comida * dias));
        System.out.println("a cantidad a pagar por otros gastos es: $" + (otrosGastos * dias));
        System.out.println("Total: $" + total);
    }
}
