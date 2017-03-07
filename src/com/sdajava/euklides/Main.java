package com.sdajava.euklides;

import java.util.Scanner;

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
                a = a - b;
            else
                b = b-  a;
        }
        System.out.println("NWD: " + a);
    }


}

