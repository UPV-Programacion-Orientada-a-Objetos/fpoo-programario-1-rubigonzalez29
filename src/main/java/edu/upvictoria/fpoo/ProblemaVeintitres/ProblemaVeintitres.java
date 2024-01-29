package edu.upvictoria.fpoo.ProblemaVeintitres;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProblemaVeintitres {

    public void problema23() throws IOException {

        double precio, descuento, iva, total;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Introduce el precio del artiulo: ");
        entrada = bufer.readLine();
        precio = Double.parseDouble(entrada);


        descuento = precio * 0.20;
        iva = precio * 0.15;

        total = (precio - descuento) + iva;

        System.out.println("El total es: " + total);


    }
}
