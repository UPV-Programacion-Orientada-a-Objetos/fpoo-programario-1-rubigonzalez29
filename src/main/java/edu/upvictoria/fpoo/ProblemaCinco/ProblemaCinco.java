package edu.upvictoria.fpoo.ProblemaCinco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCinco {

    public void problema5() throws IOException {
        double b, a, area;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;


        System.out.println("Introduce la altura: ");
        entrada = bufer.readLine();
        a = Double.parseDouble(entrada);

        System.out.println("Introduce la medida de la base: ");
        entrada = bufer.readLine();
        b = Double.parseDouble(entrada);

        area = (b*a)+((b*a)/2);

        System.out.println("El area obtenida es: " + area);
    }
}