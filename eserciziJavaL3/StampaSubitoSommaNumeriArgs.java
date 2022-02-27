/**
 * Es 1 (5 minuti)
 * [FOR/WHILE e array]
 * <p>
 * Il parametro String[] args del metodo main è un parametro che viene inizializzato all'inizio del programma con ciò che viene inserito da terminale dopo "java [nomedelprogramma]".
 * 1) scrivere un programma StampaArgs che stampi il contenuto di args, eseguire scrivendo "java StampaArgs parola1 parola2 parola3"
 * 2) scrivere un programma Somma che sommi tutti i numeri dati per argomento (senza sapere a priori quanti argomenti) (esempio di esecuzione "java Somma 2 3 4" deve stampare 9)
 */

package com.engim;

public class StampaSubitoSommaNumeriArgs {

    public static void main(String[] args) {
        //ho provato anche con  main(int[] args) //
        //int nr=0;
        //for (int i = 0; i < args.length; i++) {
        //    nr += args[i];
        //}
        //System.out.println(nr);
        //   Errore: il metodo principale non è stato trovato nella classe StampaArgs. Definire il metodo principale come:
        //   public static void main(String[] args)
        //   altrimenti una classe applicazione JavaFX deve estendere javafx.application.Application

//        int nr = 7;
//        System.out.println(nr.getClass().getName());
//        System.out.println(nr.getClass());
//        System.out.println(nr.getName());
//        String cosa = nr.getClass().getName();
//        String cosa2 = nr.getClass();
//        String cosa3 = nr.getName();
//        System.out.println("cosa" + cosa);
//        System.out.println("cosa2" + cosa2);
//        System.out.println("cosa3" + cosa3);

        int nr=0;
        for (int i = 0; i < args.length; i++) {
            nr += Integer.parseInt(args[i]);
        }
        System.out.println(nr);
    }
}