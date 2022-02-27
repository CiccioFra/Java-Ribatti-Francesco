//Si scriva un algoritmo per un semplice gioco che chieda di indovinare un codice numerico di cinque cifre.
// Quando l'utente scrive la risposta, il programma restituisce due valori:
// il numero di cifre al posto giusto e la somma di queste cifre.
// Per esempio, se il codice segreto è 53840 e l'utente ipotizza 83241, le cifre 3 e 4 sono al posto giusto.
// Il programma perciò restituirebbe in output i numeri 2 (cifre corrette) e 7 (somma).
// Si permetta all'utente di provare per un numero prefissato di volte (per esempio 10 volte).
//        (per il confronto utilizzare in un ciclo substring oppure charAt)

package com.engim.IndovinaNumeri;

import java.util.Scanner;

public class IndovinaCodice5Numeri {

    public static void main(String[] args) {

        //genero numero random con metodo della Classe Math
        int nrCasuale = (int) (Math.random() * 100000);
//          numero random con Oggetto
//        Random random = new Random();
//        int numRandom = random.nextInt(100000);

        //converto nr in stringa
        String nrString = Integer.toString(nrCasuale);
        String nrString2 = String.valueOf(nrCasuale);   //java.lang.String

        //facciamo inserire un numero di 5 cifre all'utente
        //creo oggetto Scanner
        Scanner tastiera = new Scanner(System.in);
        //catturo 5 caratteri numerici e li verifico
        System.out.println("Inserisci un numero di 5 cifre") ;

/*        int nrUtente;
        do {
            nrUtente = tastiera.nextInt();
        }
        while (nrUtente <= 10000 && nrUtente >=99999);              //viene ignorato.. Perchè?
        System.out.println("passato");
*/
        String numeriBeccati = "";
        int sommaNrBeccati = 0;
        int nrUtente = tastiera.nextInt();

        if(nrUtente==nrCasuale)
            System.out.println("Complimenti! l'hai beccato al primo tentativo!");
        else {
            String stringNumUtente = Integer.toString(nrUtente);
            for (int i = 0; i<=4; i++) {
                if (nrString.substring(i, nrString.length()) == stringNumUtente.substring(i, stringNumUtente.length()))
                    numeriBeccati += nrString.substring(i, nrString.length()) + ",";
                sommaNrBeccati += Integer.parseInt(nrString.substring(i, nrString.length()));
            }
            if(sommaNrBeccati == 0)
                System.out.println("Mi spiace,non hai preso neanche un numero, ti consiglio di NON giocare al Superenalotto!");
            else {
                System.out.println("Del numero inserito, hai indovinato: " + numeriBeccati);
            }

            System.out.println("Vuoi riprovare?\n-- Digitare \"si\" per riprovare --");
            String scelta = tastiera.nextLine();        //perchè a "scelta" viene assegnato "" ? //è il line feed? o proprio il CR? //come rimediare?

            if(scelta=="si") {
                for (int i = 0; i <= 10; i++) {

                    System.out.println("Inserisci un numero di 5 cifre");
                    stringNumUtente = tastiera.nextLine();
                    for (int ii = 0; ii <= 4; ii++) {
                        if (nrString.substring(i, nrString.length()) == stringNumUtente.substring(i, stringNumUtente.length()))
                            numeriBeccati += nrString.substring(i, nrString.length()) + ",";
                        sommaNrBeccati += Integer.parseInt(nrString.substring(i, nrString.length()));
                    }
                }
                if(sommaNrBeccati == 0)
                    System.out.println("Mi spiace,non hai preso neanche un numero, ti consiglio di NON giocare al Superenalotto!");
                else {
                    System.out.println("Del numero inserito, hai indovinato: " + numeriBeccati);
                }
            }
            System.out.println("Grazie per aver giocato con noi.");
        }



/*        for (int i = 0; i < 10; i++) {

            System.out.println("numero random con oggetto: " + numRandom);
        }

        System.out.println("Scrivi un numero di 5 cifre");
        String numUtente2 = tastiera.nextLine();
        System.out.println(numUtente2);

        String numeroS = String.valueOf(nrCasuale);
        System.out.println(numeroS);*/
    }
}
