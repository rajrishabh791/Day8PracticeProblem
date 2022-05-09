package com.bridgelabz.LineCompUC1;

import java.util.Objects;
import java.util.Scanner;

public class LCUC2 {
    int x1,x2,y1,y2,a,b,c;
    double lineLength;

    void lineEquals() {
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

        boolean z = Objects.equals(a, b);
        System.out.println("Is both line is equal : " + z);

    }
    public static void main(String args[])
    {
        LCUC2 l = new LCUC2();
        l.lineEquals();
    }
}
