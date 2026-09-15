package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso em kg:");
        double peso = entrada.nextDouble();
        System.out.println("Digite a altura em metros:");
        double altura = entrada.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Índice de Massa Corporal (IMC):\n" + imc);
    }
}