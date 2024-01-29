package edu.upvictoria.fpoo.ProblemaDiecisiete;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiecisiete {

    public void problema17() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double a,b, Hipotenusa;

        System.out.println("Introduce el tamanio del cateto A");
        entrada = bufer.readLine();
        a = Double.parseDouble(entrada);

        System.out.println("Introduce el tamanio del cateto B");
        entrada = bufer.readLine();
        b = Double.parseDouble(entrada);
        Hipotenusa = Math.sqrt((a*a)+(b*b));

        System.out.println("El tamanio de la hipotenusa es: "+ Hipotenusa);
    }
}
