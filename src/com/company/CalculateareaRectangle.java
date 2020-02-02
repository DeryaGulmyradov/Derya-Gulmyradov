package com.company;

import java.util.Scanner;

public class CalculateareaRectangle {
    public static void main(String[] args) {
        /*System.out.print("Enter Length\t:\t");
        int Width;
        Width = myScanner.nextInt();
        System.out.println("Area :  );*/

        Scanner myScanner = new Scanner(System.in);
        float price;
        float discount;
        float downPayment;
        int howManyMonth;
        System.out.print("Car Price:");
        price = myScanner.nextFloat();
        System.out.print("Discount:");
        discount = myScanner.nextFloat();
        System.out.print("DownPayment:");
        downPayment = myScanner.nextFloat();
        System.out.print("How Many Month: ");
        howManyMonth = myScanner.nextInt();
        System.out.format("Total payment is $ %.2f and monthly payment is $ %.2f for %d month/s",price,(price-discount-downPayment)/howManyMonth,howManyMonth);


        /*Scanner myScanner = new Scanner(System.in);
        System.out.print ("Write Radius: ");
        float radius;
        Float PI = 3.18F;
        radius = myScanner.nextFloat();
        System.out.format("Peremeter of circle is %.2f", 2*radius*PI);
        */


    }
}
