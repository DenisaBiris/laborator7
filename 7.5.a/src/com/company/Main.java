package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul in baza 10: ");
        int n = scanner.nextInt();
        System.out.println("In ce baza doriti sa fie convertit numarul? ");
        int b = scanner.nextInt();
        baseNumber(n,b);
        System.out.println();


    }

    public static void baseNumber(int n, int b){

        if ( n < b )
        {
            System.out.print(n);
            return;
        }

        int rem = n%b;
        baseNumber(n/b, b);
        System.out.print(rem);


    }
}
