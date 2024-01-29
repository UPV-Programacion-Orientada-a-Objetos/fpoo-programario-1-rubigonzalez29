package edu.upvictoria.fpoo.PoblemaVeintidos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaVeintidos{

    public void problema22() throws IOException {

        double pago, consumoKW, costoKW;
        String entrada;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce el consumo de luz en kilowatts:");
        entrada = bufer.readLine();
        consumoKW=Double.parseDouble(entrada);

        System.out.println("Introduce el costo por kilowatt: ");
        entrada = bufer.readLine();
        costoKW=Double.parseDouble(entrada);

        pago = consumoKW * costoKW;

        System.out.println("El total es: " + pago);

    }

}

