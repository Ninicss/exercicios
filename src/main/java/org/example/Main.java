package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        double prod = entrada.nextDouble();
        System.out.println("Digite a porcentagem de desconto:");
        double desc = 0.15;
        double valorReal = prod - (prod * desc);
        System.out.println("Preço do produto com desconto:\n" + "R$" + valorReal);
    }
}