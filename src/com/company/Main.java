package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Welcome to the examination program!");
        System.out.println("Rules : 1) When");

        int amountOfExamples = 0;
        String typeChoose = null;
        String difficultyChoose = null;

        boolean check1 = true;
        boolean check2 = true;
        boolean check3 = true;
        boolean check4 = true;
        boolean check5 = true;
        boolean check6 = true;

        String a = "a";
        String b = "b";
        String c = "c";

        while (check1) {
            System.out.println("""
                    Choose type of exam by pressing a,b or c:
                     a) Addition, Subtraction, Multiplication, Division of integers
                     b) Addition, Subtraction, Multiplication, Division of fraction
                     c) Conversions between number systems - decimal, binary and hexadecimal""");
            typeChoose = sc.nextLine();

            if (typeChoose.equalsIgnoreCase(a)) {
                check1 = false;
            }
            if (typeChoose.equalsIgnoreCase(b)) {
                check1 = false;
            }
            if (typeChoose.equalsIgnoreCase(c)) {
                check1 = false;
            }
        }

        while (check2) {
            try {
                System.out.println("How many examples do you want?");
                amountOfExamples = sc.nextInt();
                check2 = false;
            } catch (InputMismatchException e) {
                System.out.println("It must be number!");
                check2 = true;
                sc.nextLine();
            }
        }
        if (amountOfExamples == 0){
            System.out.println();
        }
        System.out.println("You choosed variant " + typeChoose + " here are your exams :");

        ArrayList<String> listChar = new ArrayList<>();
        listChar.add("+");
        listChar.add("-");
        listChar.add("*");
        listChar.add("/");

        int rnChar;
        int resultA = 0;
        int answerA = 0;
        int resultB = 0;
        int answerB = 0;
        String resultC;
        String answerC;
        int points = 0;

        if (typeChoose.equals(a)) {
            for (int i = 0; i < amountOfExamples; i++) {
                int num1 = rn.nextInt(100);
                System.out.print(num1 + " ");
                int num2 = rn.nextInt(10)+1;
                String[] ops = {"+","-","/","x"};
                rnChar = rn.nextInt(4);
                System.out.print(listChar.get(rnChar));
                integers in = new integers(num1, listChar.get(rnChar), num2 );
                System.out.print(" " + num2 + " " + "=");
                resultA = in.getResult();
                while (check4){
                    try {
                        answerA = sc.nextInt();
                        if( resultA == answerA){
                            check4 = false;
                            System.out.print("✔");
                            points++;
                        }
                        else {
                            throw new InterruptedException();
                        }
                    }catch (InputMismatchException e) {
                        System.out.println("It must be number!");
                        //check4 = true;
                        sc.nextLine();
                    }catch (InterruptedException e) {
                        System.out.println("❌ try again :");
                        //sc.nextLine();
                        points--;
                    }
                }
                check4 = true;
                System.out.println();
            }
            System.out.println("You have completed the examination with : " + points + " !");
        }

        if (typeChoose.equals(b)) {
            for (int j = 0; j < amountOfExamples; j++) {
                int numerator1 = rn.nextInt(30);
                int denominator1 = rn.nextInt(10)+1;
                System.out.print(numerator1+"/"+denominator1+" ");
                rnChar = rn.nextInt(4);
                System.out.print(listChar.get(rnChar));
                int numerator2 = rn.nextInt(30);
                int denominator2 = rn.nextInt(10)+1;
                System.out.print(" "+numerator2+"/"+denominator2+" "+"=");
                fraction fr = new fraction(numerator1, denominator1, listChar.get(rnChar), numerator2, denominator2);
                resultB = fr.getResult();
                while (check5){
                    try {
                        answerB = sc.nextInt();
                        if (resultB == answerB) {
                            check5 = false;
                            System.out.print("✔");
                            points++;
                        } else {
                            throw new InterruptedException();
                        }
                    }catch (InputMismatchException e){
                        System.out.println("It must be number!");
                        sc.nextLine();
                    } catch (InterruptedException e) {
                        System.out.println("❌ try again :");
                        //sc.nextLine();
                        points--;
                    }
                }
                check5 = true;
                System.out.println();

            }
            System.out.println(points);
        }

        if (typeChoose.equals(c)){
            for (int k = 0; k<amountOfExamples; k++){

                int rnSystem = rn.nextInt(4);

                if (rnSystem == 0){
                   int rnDecimal = rn.nextInt(100)+1;
                   System.out.println("Convert this number → " + rnDecimal + " to binary number :");
                   resultC = Integer.toBinaryString(rnDecimal);
                   //System.out.println(resultC);
                   while (check6){
                        try {
                            answerC = sc.next();
                            if (resultC.equals(answerC)){
                                check6 = false;
                                System.out.println("✔");
                                points++;
                            }else {
                                throw new InterruptedException();
                            }
                        }catch (InterruptedException e) {
                            System.out.println("❌ try again :");
                            points--;
                        }
                   }
                   check6 = true;
                }
                if (rnSystem == 1){
                    int rnDecimal = rn.nextInt(100);
                    System.out.println("Convert this number → " + rnDecimal +  " to hexadecimal number :");
                    resultC = Integer.toHexString(rnDecimal);
                    while (check6) {
                        try {
                            answerC = sc.next();
                            if (resultC.equals(answerC)){
                                check6 = false;
                                System.out.println("✔");
                                points++;
                            }else {
                                throw new InterruptedException();
                            }
                        }catch (InterruptedException e){
                            System.out.println("❌ try again :");
                            points--;
                        }
                    }
                    check6 = true;
                }
                if (rnSystem == 2){
                    int rnBinary = rn.nextInt(1);
                    System.out.println();
                }

            }
        }
    }
}