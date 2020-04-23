package com.company;

import java.util.Scanner;

public class Tablou {
         int n;
        public int[] array = new int[20];
        Scanner scanner = new Scanner(System.in);

    public void method(){

       System.out.println("Cate elemente are tabloul? ");
       n = scanner.nextInt();

        readValues();
    System.out.println('\n'+"Elementele tabloului sunt:"+'\n');
    printArray(array,n);
    reverseArray(array,0,n-1);
   System.out.println('\n');
   System.out.println("Elementele tabloului in ordine inversa sunt:\n");
    printArray(array,n);
}

    public void readValues(){
        System.out.println("Introduceti elementele tabloului:\n");
        for(int i=0;i<n;i++)
        {System.out.println("array["+i+"]=");
            array[i] = scanner.nextInt();

        }}


        public  void printArray(int[] arr, int size)
        {
            for (int i = 0; i < size; i++)
                System.out.print(arr[i] + " ");

            System.out.println();
        }
    public  void reverseArray(int[] arr, int start, int end)
        {
            int temp;

            while (start < end)
            {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }


}