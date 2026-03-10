package esercizio3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci una stringa per suddividerla in caratteri. \n Per uscire digita: ':q'");
            String s = scanner.nextLine();

            if (s.equals(":q")) break;

            StringBuilder str = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {

                str.append(s.charAt(i));

                if (i < s.length() - 1) {
                    str.append(",");
                }
            }

            System.out.println(str);

        }

    }


}
