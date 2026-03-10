package esercizio1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //eseercizio if - else if
        System.out.println("Inserisci una stringa di testo per vedere se è pari o dispari");
        String isOdd = scanner.nextLine();
        System.out.println(stringaPariDispari(isOdd));


    }


    static boolean stringaPariDispari(String str) {

        int strLength = str.length() % 2;

        if (strLength == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean annoBisestile()


}
