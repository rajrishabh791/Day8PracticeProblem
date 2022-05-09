package com.bridgelabz.LineCompUC1;

import java.util.Scanner;

public class LCUC1 {
     int x1,x2,y1,y2,a,b,c;
     double lineLength;

     void calculateLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1 : ");

        x1 = sc.nextInt();

        System.out.println("Enter the value of x2 : ");
        x1 = sc.nextInt();

        System.out.println("Enter the value of y1 : ");
        y1 = sc.nextInt();

        System.out.println("Enter the value of y2 : ");
        y2 = sc.nextInt();

        a = (x2 - x1) * (x2 - x1);
        b = (y2 - y1) * (y2 - y1);
        c = a + b;

        lineLength = (double) Math.sqrt(c);
        System.out.println("Length of a line is = " + lineLength);
    }

    public static void main(String args[])
    {
        LCUC1 l = new LCUC1();
        l.calculateLength();
    }
}
