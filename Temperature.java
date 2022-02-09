//Chiedere all'utente di inserire le temperature della settimana e stampare la media, la temperatura massima e la minima

import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        // int[] n = new int[10];
        // n[0] = 0;
        // System.out.println(n[0]);
        Scanner tastiera = new Scanner(System.in);
        //int n = Integer.parseInt(tastiera.nextLine());
        int array[] = new int[7];
        int tot, media, max, min;
        
        System.out.println("Inserire le temperature giornaliere della settimana passata:");
        
        for(int i=0; i < 7; i++){
            System.out.print("temperatura del " + i+1 + "° giorno: ");
            array[i] = Integer.parseInt(tastiera.nextLine());
            tot +=array[i];
        }
        
        media = tot/array.length;
        
        for (int i : array) {
            
        }
        for(int i=0; i < array.length-1; i++){
            int n = 0;
            if (array[n] < array[i])
            min = array[i];
            if (array[n] > array[i])
            min = array[i];
            
        }
        System.out.println("la media della temperatura della settimana passata è stata di: " + media + "°");
        
        
    }
}

// ash dell'ultimo commit, codice univoco del commit e si usa per andare indietro o avanti
// git .. ed utilizza l'ash può tornare indietro