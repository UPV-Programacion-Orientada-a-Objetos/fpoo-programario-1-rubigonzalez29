package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.PoblemaVeintidos.ProblemaVeintidos;
import edu.upvictoria.fpoo.PracticaNueve.ProblemaNueve;
import edu.upvictoria.fpoo.ProblemaCatorce.ProblemaCatorce;
import edu.upvictoria.fpoo.ProblemaCinco.ProblemaCinco;
import edu.upvictoria.fpoo.ProblemaCuatro.ProblemaCuatro;
import edu.upvictoria.fpoo.ProblemaDiecinueve.ProblemaDiecinueve;
import edu.upvictoria.fpoo.ProblemaDieciocho.ProblemaDieciocho;
import edu.upvictoria.fpoo.ProblemaDieciseis.ProblemaDiciseis;
import edu.upvictoria.fpoo.ProblemaDiecisiete.ProblemaDiecisiete;
import edu.upvictoria.fpoo.ProblemaDiez.ProblemaDiez;
import edu.upvictoria.fpoo.ProblemaDoce.ProblemaDoce;
import edu.upvictoria.fpoo.ProblemaDos.ProblemaDos;
import edu.upvictoria.fpoo.ProblemaOcho.ProblemaOcho;
import edu.upvictoria.fpoo.ProblemaOnce.ProblemaOnce;
import edu.upvictoria.fpoo.ProblemaQuince.ProblemaQuince;
import edu.upvictoria.fpoo.ProblemaSeis.ProblemaSeis;
import edu.upvictoria.fpoo.ProblemaSiete.ProblemaSiete;
import edu.upvictoria.fpoo.ProblemaTrece.ProblemaTrece;
import edu.upvictoria.fpoo.ProblemaTres.ProblemaTres;
import edu.upvictoria.fpoo.ProblemaUno.ProblemaUno;
import edu.upvictoria.fpoo.ProblemaVeinte.ProblemaVeinte;
import edu.upvictoria.fpoo.ProblemaVeinticinco.ProblemaVeinticinco;
import edu.upvictoria.fpoo.ProblemaVeinticuatro.ProblemaVeinticuatro;
import edu.upvictoria.fpoo.ProblemaVeintitres.ProblemaVeintitres;
import edu.upvictoria.fpoo.ProblemaVeintiuno.ProblemaVeintiuno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Problema 1");
            System.out.println("2. Problema 2");
            System.out.println("3. Problema 3");
            System.out.println("4. Problema 4");
            System.out.println("5. Problema 5");
            System.out.println("6. Problema 6");
            System.out.println("7. Problema 7");
            System.out.println("8. Problema 8");
            System.out.println("9. Problema 9");
            System.out.println("10. Problema 10");
            System.out.println("11. Problema 11");
            System.out.println("12. Problema 12");
            System.out.println("13. Problema 13");
            System.out.println("14. Problema 14");
            System.out.println("15. Problema 15");
            System.out.println("16. Problema 16");
            System.out.println("17. Problema 17");
            System.out.println("18. Problema 18");
            System.out.println("19. Problema 19");
            System.out.println("20. Problema 20");
            System.out.println("21. Problema 21");
            System.out.println("22. Problema 22");
            System.out.println("23. Problema 23");
            System.out.println("24. Problema 24");
            System.out.println("25. Problema 25");
            System.out.println("0. Salir");


            try {
                System.out.print("Ingrese el problema que quieres ver: ");
                opcion = Integer.parseInt(reader.readLine());

                switch (opcion) {
                    case 1:
                        ProblemaUno problemaUno = new ProblemaUno();
                        problemaUno.problema1();
                        break;
                    case 2:
                        ProblemaDos problemaDos = new ProblemaDos();
                        problemaDos.problema2();
                        break;
                    case 3:
                        ProblemaTres problemaTres = new ProblemaTres();
                        problemaTres.problema3();
                        break;
                    case 4:
                        ProblemaCuatro problemaCuatro = new ProblemaCuatro();
                        problemaCuatro.problema4();
                        break;
                    case 5:
                        ProblemaCinco problemaCinco= new ProblemaCinco();
                        problemaCinco.problema5();
                        break;
                    case 6:
                        ProblemaSeis problemaSeis= new ProblemaSeis();
                        problemaSeis.problema6();
                        break;
                    case 7:
                        ProblemaSiete problemaSiete= new ProblemaSiete();
                        problemaSiete.problema7();
                        break;
                    case 8:
                        ProblemaOcho problemaOcho= new ProblemaOcho();
                        problemaOcho.problema8();
                        break;
                    case 9:
                        ProblemaNueve problemaNueve= new ProblemaNueve();
                        problemaNueve.problema9();
                        break;
                    case 10:
                        ProblemaDiez problemaDiez= new ProblemaDiez();
                        problemaDiez.problema10();
                        break;
                    case 11:
                        ProblemaOnce problemaOnce= new ProblemaOnce();
                        problemaOnce.problema11();
                        break;
                    case 12:
                        ProblemaDoce problemaDoce= new ProblemaDoce();
                        problemaDoce.problema12();
                        break;
                    case 13:
                        ProblemaTrece problemaTrece= new ProblemaTrece();
                        problemaTrece.problema13();
                        break;
                    case 14:
                        ProblemaCatorce problemaCatorce = new ProblemaCatorce();
                        problemaCatorce.problema14();
                        break;
                    case 15:
                        ProblemaQuince problemaQuince = new ProblemaQuince();
                        problemaQuince.problema15();
                        break;
                    case 16:
                        ProblemaDiciseis problemaDieciseis= new ProblemaDiciseis();
                        problemaDieciseis.problema16();
                        break;
                    case 17:
                        ProblemaDiecisiete problemaDiecisiete= new ProblemaDiecisiete();
                        problemaDiecisiete.problema17();
                        break;
                    case 18:
                        ProblemaDieciocho problemaDieciocho= new ProblemaDieciocho();
                        problemaDieciocho.practica18();
                        break;
                    case 19:
                        ProblemaDiecinueve problemaDiecinueve= new ProblemaDiecinueve();
                        problemaDiecinueve.practica19();
                        break;
                    case 20:
                        ProblemaVeinte problemaVeinte= new ProblemaVeinte();
                        problemaVeinte.problema20();
                        break;
                    case 21:
                        ProblemaVeintiuno problemaVeintiuno= new ProblemaVeintiuno();
                        problemaVeintiuno.problema21();
                        break;
                    case 22:
                        ProblemaVeintidos problemaVeintidos = new ProblemaVeintidos();
                        problemaVeintidos.problema22();
                        break;
                    case 23:
                        ProblemaVeintitres problemaVeintitres = new ProblemaVeintitres();
                        problemaVeintitres.problema23();
                        break;
                    case 24:
                        ProblemaVeinticuatro problemaVeinticuatro = new ProblemaVeinticuatro();
                        problemaVeinticuatro.problema24();
                        break;
                    case 25:
                        ProblemaVeinticinco problemaVeinticinco = new ProblemaVeinticinco();
                        problemaVeinticinco.problema25();
                        break;
                    case 0:
                        System.out.println("Gracias por utilizar");
                        break;
                    default:
                        System.out.println("Error");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Vuelve a intentarlo");
                opcion = -1;
            }
        } while (opcion != 0);

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
