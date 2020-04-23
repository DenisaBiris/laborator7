package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati valoarea lui n: ");
        int n = scanner.nextInt();
        System.out.println("Dati valorile vectorului v :\n");
        int[]v=new int[50];
        for(int i=0;i<n;i++)
        {System.out.print("v["+i+"]= ");
            v[i]= scanner.nextInt();}
        System.out.println("Suma este: "+suma(v,n));

    }

    public static int suma(int[] v, int n){
        if(n>0)
            return v[n-1]+suma(v,n-1);
        else return 0;
    }
}