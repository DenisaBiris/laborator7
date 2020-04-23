package com.company;


import java.util.ArrayList;
import java.util.Scanner;

    public class Lista {
            public ArrayList<String> lista = new ArrayList<String>();
            public int n;
            public String element;
            public void reverseOrder()
            {
                System.out.println("Cate elemente doriti sa aiba lista?  ");
                Scanner scanner = new Scanner(System.in);
                n = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti elementele listei:");
                for (int i = 0; i <n ; i++) {
                    System.out.print("Elemntul #"+ (i+1) +" : ");
                    element = scanner.nextLine();
                    lista.add(element);
                }
                System.out.println("Elementele listei in ordine inversa sunt: ");
                print(n-1,lista);
            }
            public void print(int n,ArrayList lista)
            {
                if(n>=0)
                {
                    System.out.print(lista.get(n) +"   ");
                    print(n-1,lista);
                }
            }
        }

