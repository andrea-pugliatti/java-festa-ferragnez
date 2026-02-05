package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guests = {
                "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio",
                "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"
        };

        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String input = in.nextLine();
        in.close();

        boolean found = false;
        int i = 0;

        while (!found && i < guests.length) {
            if (guests[i].equals(input)) {
                found = true;
            }
            i++;
        }

        // for (int i = 0; i < guests.length; i++) {
        // if (guests[i].equals(input)) {
        // found = true;
        // break;
        // }
        // }

        if (found) {
            System.out.println("Puoi entrare!");
        } else {
            System.out.println("Vai via!");
        }

    }
}
