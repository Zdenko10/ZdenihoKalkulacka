package com.engeto.lekce2;


import com.sun.nio.sctp.AssociationChangeNotification;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        do {
            System.out.println("Vítejte ve Zdeního kalkulačce.");
            System.out.println("Jakou operaci si přejete?");
            System.out.println("1.SČÍTÁNÍ");
            System.out.println("2.ODEČÍTÁNÍ");
            System.out.println("3.NÁSOBENÍ");
            System.out.println("4.DĚLENÍ");

            Scanner sc = new Scanner(System.in);

            int volba = sc.nextInt();

            if (volba == 1) {
                System.out.println("Zvoleno SČÍTÁNÍ");
                System.out.println("Zadejte první číslo: ");
                int a = sc.nextInt();
                System.out.println("Zadejte druhé číslo: ");
                int b = sc.nextInt();
                System.out.println("Součet čísel " + a + " a " + b + " je " + (a + b) + ".");
            }
            if (volba == 2) {
                System.out.println("Zvoleno ODEČÍTÁNÍ");
                System.out.println("Zadejte první číslo: ");
                int a = sc.nextInt();
                System.out.println("Zadejte druhé číslo: ");
                int b = sc.nextInt();
                System.out.println("Rozdíl čísel " + a + " a " + b + " je " + (a - b) + ".");
            }
            if (volba == 3) {
                System.out.println("Zvoleno NÁSOBENÍ");
                System.out.println("Zadejte první číslo: ");
                int a = sc.nextInt();
                System.out.println("Zadejte druhé číslo: ");
                int b = sc.nextInt();
                System.out.println("Součin čísel " + a + " a " + b + " je " + (a * b) + ".");
            }
            if (volba == 4) {
                System.out.println("Zvoleno DĚLENÍ");
                System.out.println("Zadejte první číslo: ");
                int a = sc.nextInt();
                System.out.println("Zadejte druhé číslo: ");
                int b = sc.nextInt();
                System.out.println("Podíl čísel " + a + " a " + b + " je " + (a / b) + ".");
            }
            if ((volba < 1) || (volba > 4)) {
                System.out.println("!NEPLATNÁ VOLBA!");
            }

            System.out.println("PŘEJETE SI POUŽÍT KALKULAČKU ZNOVU? ");
            System.out.println("ANO / NE");


            String again = sc.nextLine();
            again.toLowerCase();

        }

        while (again.equals("ano"));


        System.out.println("DĚKUJI ZA POUŽIZÍ KALKULAČKY");
    }
}
