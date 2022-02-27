package com.engim.LettereComuni;

import java.util.Arrays;
import java.util.Scanner;

public class LettereComuni {
    public static void main(String[] args) {
        System.out.println("inserisci 2 stringhe, ti restituirò i caratteri uguali");
        System.out.println("Prima stringa: ");
        Scanner tastiera = new Scanner(System.in);
        String stringa1 = tastiera.nextLine();
        System.out.println("Seconda Stringa: ");
        String stringa2 = tastiera.nextLine();
        String charUguali = "";
        for (char carattere1 : stringa1.toCharArray()) {
            for (char carattere2 : stringa2.toCharArray()) {
                if(carattere1 == carattere2)
                    charUguali += carattere1 + ", ";
                continue;
            }
        }
        System.out.println("Le lettere uguali delle 2 stringhe sono: " + charUguali);
    }


    //non usato //cmq, forse era meglio un for normale, così usavo lo stesso indice x 2 cose..?
    public static char[] stringaInCharArray(String stringa){
        char[] arrCaratteri = new char[stringa.length()];
        for (char carattere : stringa.toCharArray()) {
            int i = 0;
            arrCaratteri[i] = carattere;
            i++;
        }
        return arrCaratteri;
    }
}
