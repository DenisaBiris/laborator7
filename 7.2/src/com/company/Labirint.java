package com.company;

public class Labirint {
   int n=5;
    char[][] m = new char[n+1][n+1];
    char[][][] c = new char[n+1][n+1][n+1];
    int[] arr = new int[n+1];
    int pozitie = 0;
    int INIT_MIN=999;
  public void labirint(){

   for (int  i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++)
    m[i][j] = '*';
for (int j = 2; j <= 5; j++)
    m[1][j] = ' ';
    m[2][1] = ' ';
    m[2][2] = ' ';
    m[2][4] = ' ';
    m[3][2] = ' ';
    m[3][3] = ' ';
    m[3][4] = ' ';
    m[4][2] = ' ';
    m[5][2] = ' ';
    tipar();
     // a = div(n, 2);
      p(n/2, n/2);
     gasireMin();}


    public void tipar()
    {int nr=0;
        for (int i = 0; i <= n; i++)
        {   System.out.println("       ");
            for (int j = 0; j <= n; j++)
            {System.out.print(m[i][j]);
                c[pozitie][i][j]=m[i][j];

                if(m[i][j]=='+')
                    nr++;

            }

            System.out.println(); }

        System.out.println();
        arr[pozitie]=nr;
        System.out.println("In acest caz, exista "+nr+" <<+>>-uri pe pozitia "+pozitie+'\n');
        pozitie++;



    }

    public void p(int x, int y)
    {
        if (m[x][y] == ' ')
        {   m[x][y] = '+';

           // a = div(x, n);
          //  b = div(y, n);
            if ((x%n == 0) || (y%n == 0))
                tipar();
            else   {
                p(x + 1, y);
                p(x, y + 1);
                p(x - 1, y);
                p(x, y - 1);   }
            m[x][y] = ' ';


        } }

   public void gasireMin()
    {int min;
    int poz=0;

        min=INIT_MIN;

        for(int i=1;i<pozitie;i++)
            if(arr[i]<min){
                min=arr[i];
                poz=i;
            }

        System.out.println("Minimul este "+min+" pe pozitia "+poz+'\n');
        for (int i = 0; i <= n; i++)
        {  System.out.println("       ");
            for (int j = 0; j <= n; j++)
            {System.out.print(c[poz][i][j]);
            } System.out.println();

        }}

}
