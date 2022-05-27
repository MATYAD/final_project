package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int amountOfExamples = 0;
        String typeChoose = null;

        boolean tryAgain1 = true;

        String a = "a";
        String b = "b";
        String c = "c";

        while (tryAgain1) {
            System.out.println("""
                    Choose type of exam by pressing a,b or c:
                     a) Addition, Subtraction, Multiplication, Division of integers
                     b) Addition, Subtraction, Multiplication, Division of fraction
                     c) Conversions between number systems - decimal, binary and hexadecimal""");
            typeChoose = sc.nextLine();

            if (typeChoose.equals(a)) {
                tryAgain1 = false;
            }
            if (typeChoose.equals(b)) {
                tryAgain1 = false;
            }
            if (typeChoose.equals(c)) {
                tryAgain1 = false;
            }
        }

        boolean check = true;
        while(check) {
            try{
                System.out.println("How many examples do you want?");
                amountOfExamples = sc.nextInt();
                check=false;
            }catch(InputMismatchException e){
                System.out.println("It must be number!");
                check = true;
                sc.nextLine();
            }
        }
        System.out.println("You choosed variant "+typeChoose+ " here are your exams :");

        ArrayList<Integer> aListInt1 = new ArrayList<>();
        ArrayList<Integer> aListInt2 = new ArrayList<>();
        ArrayList<String> chars = new ArrayList<>();
        chars.add("+");
        chars.add("-");
        chars.add("*");
        chars.add("/");

        if(typeChoose.equals(a)){
            for (int i = 0; i < amountOfExamples; i++){
                int aNum1 = rn.nextInt(2000)-1000;
                aListInt1.add(aNum1);
            }
            for (int j = 0; j< amountOfExamples; j++){
                int aNum2 = rn.nextInt(2000)-1000;
                aListInt2.add(aNum2);
            }
        }
        ArrayList<Integer> bListInt1 = new ArrayList<>();
        ArrayList<Integer> bListInt2 = new ArrayList<>();

        if(typeChoose.equals(b)){
            for (int l = 0; l<amountOfExamples; l++){
                int bNum1 = rn.nextInt(100);
                System.out.println(bNum1);
        }
        }

        for (int k = 0; k<amountOfExamples; k++){
            int sum = aListInt1.get(k)+aListInt2.get(k);
            ArrayList<Integer> listResult = new ArrayList<>();
            System.out.println(sum);

            }




    }


}


