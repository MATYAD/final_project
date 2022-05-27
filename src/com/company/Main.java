package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int amountOfExamples = 0;
        String typeChoose = null;
        String difficultyChoose = null;

        boolean check1 = true;
        boolean check2 = true;
        boolean check3 = true;

        String a = "a";
        String b = "b";
        String c = "c";

        String ez = "e";
        String md = "m";
        String hd = "h";

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
        while (check3) {
            System.out.println("""
                Choose the difficulty of exams:
                e) Easy
                m) Medium
                h) Hard""");
            difficultyChoose = sc.nextLine();

            if (difficultyChoose.equalsIgnoreCase(ez)){
                check3 = false;
            }
            if (difficultyChoose.equalsIgnoreCase(md)){
                check3 = false;
            }
            if (difficultyChoose.equalsIgnoreCase(hd)){
                check3 = false;
            }
        }

        while(check2) {
            try{
                System.out.println("How many examples do you want?");
                amountOfExamples = sc.nextInt();
                check2=false;
            }catch(InputMismatchException e){
                System.out.println("It must be number!");
                check2 = true;
                sc.nextLine();
            }
        }
        System.out.println("You choosed variant "+typeChoose+ " here are your exams :");

        ArrayList<Integer> listEasy = new ArrayList<>();
        ArrayList<String> listChar = new ArrayList<>();
        listChar.add("+");
        listChar.add("-");
        listChar.add("*");
        listChar.add("/");

        for (int i = 0; i<amountOfExamples; i++){
            int num1 = rn.nextInt(100);
            listEasy.add(num1);
            System.out.print(num1+" ");
            int rnChar = rn.nextInt(3);
            System.out.print(listChar.get(rnChar));
            int num2 = rn.nextInt(100);
            listEasy.add(num2);
            System.out.print(" "+num2+" "+ "=");
            System.out.println();
        }




    }
}
