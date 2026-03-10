package esercizio2;

import java.util.Scanner;


public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero da 0 a 3");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Il numero che hai digitato è: " + numeroInLettere(num));

        
    }

    static String numeroInLettere(int num) {

        String str = switch (num) {
            case 0 -> "Zero";
            case 1 -> "Uno";
            case 2 -> "Due";
            case 3 -> "Tre";
            default -> "Numero non valido";
        };

        return str;
    }

}
