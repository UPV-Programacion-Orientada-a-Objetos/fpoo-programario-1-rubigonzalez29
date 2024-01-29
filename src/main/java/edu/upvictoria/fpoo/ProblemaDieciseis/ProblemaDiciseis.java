package edu.upvictoria.fpoo.ProblemaDieciseis;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiciseis {

    public void problema16() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double largo, ancho, costo, total, m2;

        System.out.println("Introduce los metros de  ancho: ");
        entrada = bufer.readLine();
        ancho = Double.parseDouble(entrada);

        System.out.println("Introduce los metros de largo: ");
        entrada = bufer.readLine();
        largo = Double.parseDouble(entrada);

        m2 = largo*ancho;

        System.out.println("La cantidad de metros cuadrados es: "+ m2);

        System.out.println("Introduce el precio del metro cuadrado: ");
        entrada = bufer.readLine();
        costo = Double.parseDouble(entrada);

        total = costo*m2;

        System.out.println("Total:  "+ total);
    }
}
