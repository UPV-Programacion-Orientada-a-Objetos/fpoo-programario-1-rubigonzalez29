package edu.upvictoria.fpoo.ProblemaTres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaTres {

    public void problema3() throws IOException {

        double base =0, altura =0, area=0;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Introduce la medida de la base: ");
        entrada = bufer.readLine();
        base = Double.parseDouble(entrada);

        System.out.println("Introduce la medida de la altura: ");
        entrada = bufer.readLine();
        altura = Double.parseDouble(entrada);


        area = (base*altura);

        System.out.println("El area es: "+ area);
    }

}
