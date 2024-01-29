package edu.upvictoria.fpoo.ProblemaVeinticuatro;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeinticuatro {

    public void problema24() throws IOException {
        double sueldoSemanal,ahorroSemanal,ahorroMensual,ahorroAnual;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Ingrese el sueldo semanal:");
        entrada = bufer.readLine();
        sueldoSemanal = Double.parseDouble(entrada);

        ahorroSemanal = sueldoSemanal * 0.15;
        ahorroMensual = ahorroSemanal * 4;
        ahorroAnual = ahorroMensual * 12;

        System.out.println("El ahorro anual es:" + ahorroAnual);
    }
}
