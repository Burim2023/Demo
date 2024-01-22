/*
 * Project: Logarithmische Funktion
 * Klasse: 1 aApc
 * Author: Burim Shala
 * Last change:
 *   by: Shala
 *   date: 07.12.2023
 * */

public class Main {

    public static void main(String[] args) {
        for (int i = 80; i > 0; i--) {
            double vergroeßerungsfaktor;
            vergroeßerungsfaktor=85 * Math.log10(i);
            for (int j = 0; j < vergroeßerungsfaktor; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}