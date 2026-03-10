package esercizio1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //esercizio if - else if
        System.out.println("Inserisci una stringa di testo per vedere se è pari o dispari");
        String isOdd = scanner.nextLine();
        System.out.println(stringaPariDispari(isOdd));

        System.out.println("Ora vediamo se un anno è bisestile o meno. Prova ad inserire un anno");
        int anno = scanner.nextInt();
        System.out.println(annoBisestile(anno));

    }


    static boolean stringaPariDispari(String str) {

        int strLength = str.length() % 2;

        return strLength == 0;

//        if (strLength == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }

    static boolean annoBisestile(int anno) {
        if (anno % 4 == 0 || anno % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
