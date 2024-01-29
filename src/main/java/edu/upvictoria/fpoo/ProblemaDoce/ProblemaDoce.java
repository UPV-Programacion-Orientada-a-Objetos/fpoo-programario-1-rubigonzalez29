package edu.upvictoria.fpoo.ProblemaDoce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDoce{

    public void problema12() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double base, altura, area;

        System.out.println("Introduce la medida de la base del triangulo:  ");
        entrada = bufer.readLine();
        base = Double.parseDouble(entrada);

        System.out.println("Introduce la medida de la altura del triangulo:  ");
        entrada = bufer.readLine();
        altura = Double.parseDouble(entrada);

        area = (base*altura)/2;

        System.out.println("El area total es:  "+area);

    }
}
