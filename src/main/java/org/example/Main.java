package org.example;public class Main {
    public static void main(String[] args) {
        float varF = 2.7f;
        long varL = (long) varF; //casting explícito
        double varD = varL; //casting implícito
        System.out.println("Valor float " + varF);
        System.out.println("Valor long: " + varL);
        System.out.println("Valor double: " + varD);


    }
}