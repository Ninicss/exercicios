package org.example;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário do cliente:");
        double salario = entrada.nextDouble();

        System.out.println("Digite o valor da parcela desejada:");
        double parcela = entrada.nextDouble();

        double limite = salario * 0.30;

        if (parcela <= limite) {
            System.out.println("Empréstimo aprovado.");
        } else {
            System.out.println("Empréstimo recusado. A parcela excede 30% do salário.");
        }
    }
}