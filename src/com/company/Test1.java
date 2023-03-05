package com.company;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int a,b;
        a= sr.nextInt();
        b= sr.nextInt();
        int r=(int)Math.sqrt((double)a);
        int h=1;
        int [][] c=new int[r*r*r][3];
        int count=0;
        int i;
        int j;
        for(i=r;i>0;i--)
        {    for(j=h;j<=r;j++)
        { c[count][0]=i*i*j;
            c[count][1]=i*i;
            c[count++][2]=2*i*j;}
            c[count++][0]=0;}
         for(count--;count>=0;count--)
             System.out.println(c[count][0]);



    }




    }


