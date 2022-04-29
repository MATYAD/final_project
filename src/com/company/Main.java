package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int AmountOfExamples=0;
        String typeChoose = null;

        System.out.println("Choose type of exam by pressing a,b or c:\n " +
                "a) Addition, Subtraction, Multiplication, Division of integers\n " +
                "b) Addition, Subtraction, Multiplication, Division of fraction\n " +
                "c) Conversions between number systems - decimal, binary and hexadecimal");
    try {
        typeChoose = sc.nextLine();
    }
    catch(InputMismatchException e) {
        System.out.println("It must be a, b or c!");
    }
    String a = typeChoose;

        switch (a) {
            case "a":
                System.out.println("You choosed variant a");
                break;
            case "b":
                System.out.println("You choosed variant b");
                break;
            case "c":
                System.out.println("You choosed variant c");
                break;
        }










    }
}
