package com.company;

import java.util.Scanner;

    public class Permutation {
        String[] arr = new String[100];
        String[] copy = new String[100];
        int n;
        public void perm(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dati numarul de studenti: ");
            n = scanner.nextInt();
            for(int i=0;i<n;i++)
            {
                System.out.print("Studentul nr#"+(i+1)+": ");
                arr[i]= scanner.next();}
            for(int j=0;j<n/5;j++)
            {
                System.out.println("Grupa nr" + (j+1)+":-----------------------------------------"+'\n');
                for(int i=0;i<5;i++)
                {
                    copy[i]=arr[(j*5)+i];
                    System.out.print(copy[i]+ " ");
                }
                System.out.println();
                System.out.println("Permutarile pentru grupa " + (j+1 )+ ":"+'\n');
                permutation(copy,5,5);
            }}
       public void permutation(String[] copy, int size, int n)
        {
            if (size == 1)
                printArr(copy,n);
            for (int i=0; i<size; i++)
            {
                permutation(copy, size-1, n);
                if (size % 2 == 1)
                {
                    String temp = copy[0];
                    copy[0] = copy[size-1];
                    copy[size-1] = temp;
                }
                else
                {
                    String temp = copy[i];
                    copy[i] = copy[size-1];
                    copy[size-1] = temp;
                }
            }
        }
        public void printArr(String[] copy, int n){
            for(int i=0;i<n;i++)
                System.out.print(copy[i] + " ");
            System.out.println();
        }
    }