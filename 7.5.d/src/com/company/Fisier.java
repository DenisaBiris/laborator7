package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Fisier {

    String[] arr = new String[10];
    String[] copy = new String[10];

    int i = 0;

    File filein = new File("original.txt");


    public void read(int i,Scanner scanner) throws IOException {
       try {

           if (scanner.hasNextLine()) {
               arr[i] = scanner.nextLine();
               i++;
               read(i,scanner);
           }
           else{
           FileWriter myWriter = new FileWriter("copy.txt");
          do {
               myWriter.write(arr[i-1] + '\n');
               i--;
           }
           while (i > 0);


           myWriter.flush();
           myWriter.close();}
       } catch (FileNotFoundException e) {
           System.out.println("An error occurred.");
           e.printStackTrace();


       }

   }


        public void method() throws IOException {
            Scanner scanner = new Scanner(filein);
            read(i,scanner);
       System.out.println("Copy finished!");
        }
        }




