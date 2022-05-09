package com.bridgelabz.LineCompUC1;

import java.util.Objects;
import java.util.Scanner;

public class LCUC3 {
    int x1,x2,y1,y2,a,b,c,d,e;
    double lineLength;

    void lengthComparison() {
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
        d = a-b;
        e = b-a;

        lineLength = (double) Math.sqrt(c);
        System.out.println("Length of a line is = " + lineLength);

        boolean z = Objects.equals(a, b);
        System.out.println("Is both line is equal : " + z);

        if (a > b) {
            System.out.println("Line A is greater than line B by " + d + "cm");
        }
        else{
            System.out.println("Line B is greater than line A by " + e + "cm");
        }
    }
    public static void main(String args[])
    {
        LCUC3 l = new LCUC3();
        l.lengthComparison();
    }
}
