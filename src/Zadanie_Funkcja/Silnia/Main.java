package Zadanie_Funkcja.Silnia;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        int a, b, c;

        System.out.println("Podaj pierwszą liczbę: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        b = in.nextInt();


        // System.out.println(a + "\t"+ b);

        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        System.out.println("NWD: " + a);
    }


}

