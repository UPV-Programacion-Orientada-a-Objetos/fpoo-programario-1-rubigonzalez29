package edu.upvictoria.fpoo.ProblemaVeinte;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaVeinte{

    public double CostoLLamada(double a, double b) {
        return a*b;
    }

    public void problema20() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double tiem_llamada, costo_minuto, total;

        System.out.println("Introduce la duracion de la llamada (min): ");
        entrada = bufer.readLine();
        tiem_llamada = Double.parseDouble(entrada);

        System.out.println("Introduce el costo por minuto: ");
        entrada = bufer.readLine();
        costo_minuto = Double.parseDouble(entrada);

        total = costo_minuto*tiem_llamada;

        System.out.println("El costo de la llamada es: " + total);

    }
}
