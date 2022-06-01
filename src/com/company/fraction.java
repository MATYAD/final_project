package com.company;

public class fraction {
    private String question;
    private int result;

    public fraction(int n1,int n2, String op, int n3, int n4) {
        if (op.equals("+")){
            result = n1/n2 + n3/n4;
        }
        if (op.equals("-")){
            result = n1/n2 - n3/n4;
        }
        if (op.equals("*")){
            result = n1/n2 * n3/n4;
        }
        if (op.equals("/")){
            result = n1/n2 / n3/n4;
        }
    }
    public int getResult() {
        return result;
    }
}
