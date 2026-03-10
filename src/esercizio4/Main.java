package esercizio4;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire tempo per conto alla rovescia");
        int num = scanner.nextInt();

        if (num < 0) num = Math.abs(num);

        if (num > 20) {
            num = 20;
            System.out.println("Ecceduto limite di sicurezza, forzato a 20 sec.");
        }

        System.out.println(countDownReport(num));
    }


    static StringBuilder countDownReport(int num) {

        StringBuilder report = new StringBuilder();
        String inizio = "Secondi al lancio: " + num;
        String sec10 = "--- SEPARAZIONE MODULO ---";
        String sec0 = "--- IGNITION ---";

        for (int i = num; i >= 0; i--) {

            if (i == num) report.append(inizio);

            String sec = i % 2 == 0 ? "[OK] " + i : "[CHECK] " + i;
            if (i == 0) sec = sec0;
            report.append('\n').append(sec);

            if (i == 10) report.append('\n').append(sec10);


        }

        return report;
    }


}
