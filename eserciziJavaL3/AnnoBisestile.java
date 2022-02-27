//Scrivere un programma che stampi se l'anno inserito è bisestile.
//un anno è bisestile Se è divisibile per 4, per 100, ma non per 400

package com.engim.AnnoBisestile;

import java.util.Scanner;

public class AnnoBisestile {
    public static void main(String[] args) {
        System.out.print("Inserisci l'anno per verificare che sia bisestile: ");
        Scanner tastiera = new Scanner(System.in);
        int annoInserito = tastiera.nextInt();
        verificaBisestile(annoInserito);
    }

    public static void verificaBisestile(int annoDaVerificare){
        if (annoDaVerificare < 0)
            System.out.println("Inserisci un anno reale...");
        else if((annoDaVerificare % 4 == 0 || annoDaVerificare % 100 == 0) && annoDaVerificare % 400 != 0 )
            System.out.println("L'anno " + annoDaVerificare + " da te inserito è bisestile");
        else
            System.out.println("L'anno " + annoDaVerificare + " da te inserito NON è bisestile");
    }
}
