package edu.upvictoria.fpoo.ProblemaQuince;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaQuince {

    public void problema15() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double tarifa = 15, horas, cobro;


        System.out.println("Introduzca la cantidad de horas que utilizó el estacionamiento:");
        entrada = bufer.readLine();
        horas = Double.parseDouble(entrada);

        cobro = (int) Math.ceil(horas) * tarifa;

        System.out.println("El costo por " + horas + " horas es: $" + cobro);
    }
}
