package edu.upvictoria.fpoo.ProblemaUno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaUno {

    public void problema1() throws IOException {
        double total,a,b;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Introduce el valor de primer num: ");
        entrada = bufer.readLine();
        a = Double.parseDouble(entrada);

        System.out.println("Introduce el valor del segundo num: ");
        entrada = bufer.readLine();
        b = Double.parseDouble(entrada);

        total = a + b;

        System.out.println("Resultado: " + total);
    }

}
