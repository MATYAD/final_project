package com.company;

public class integers {

    private String question;
    private int result;
        public integers(int n1, String op, int n2) {
            if (op.equals("+")){
                result = n1 + n2;
            }
            if (op.equals("-")){
                result = n1 - n2;
            }
            if (op.equals("*")){
                result = n1 * n2;
            }
            if (op.equals("/")){
                result = n1 / n2;
            }
        }
        public int getResult() {

            return result;
        }
}
