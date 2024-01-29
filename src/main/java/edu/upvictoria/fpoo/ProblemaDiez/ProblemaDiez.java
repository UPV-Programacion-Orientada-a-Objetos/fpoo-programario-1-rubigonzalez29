package edu.upvictoria.fpoo.ProblemaDiez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiez {

    public void problema10() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double metros, pulgadas;

        System.out.println("Introduce la cantidad de metros en tela: ");
        entrada = bufer.readLine();
        metros = Double.parseDouble(entrada);

        pulgadas = metros/0.0254;

        System.out.println("Las pulgadas a pedir de tela son las siguientes: " + pulgadas);

    }
}
