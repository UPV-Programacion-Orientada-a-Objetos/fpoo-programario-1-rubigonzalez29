package edu.upvictoria.fpoo.ProblemaSiete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaSiete{

    public void problema7() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double litros, precio_litro, galones, total;

        System.out.println("Ingresa la cantidad de litros producidos: ");
        entrada = bufer.readLine();
        litros = Double.parseDouble(entrada);

        System.out.println("-----------------------------------------------------------");

        galones = (litros/3.785);

        System.out.println( litros + " Los litros de leche equivalen a " + galones + " Galones de leche");
        System.out.println("-----------------------------------------------------------");

        System.out.println("Introduce el precio del galon:  ");
        entrada = bufer.readLine();
        precio_litro= Double.parseDouble(entrada);

        total = (precio_litro*galones);

        System.out.println("La venta de los " + litros+ " litros de leche, nos deja una ganancia de $: " + total);

    }
}
