package edu.upvictoria.fpoo.ProblemaOcho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaOcho {

    public void problema8() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double distancia_x, distancia_y, distancia_p;

        System.out.println("Introduce la distancia entre los puntos 1 y 2 del eje de las x ");
        entrada = bufer.readLine();
        distancia_x = Double.parseDouble(entrada);

        System.out.println("Introduce la distancia entre los puntos 1 y 2 del eje de las y");
        entrada = bufer.readLine();
        distancia_y = Double.parseDouble(entrada);
        distancia_p = Math.sqrt((distancia_x*distancia_x)+(distancia_y*distancia_y));

        System.out.println("La distancia entre los puntos es: "+ distancia_p);
    }
}
