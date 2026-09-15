package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da hora trabalhada:");
        double valorHora = entrada.nextDouble();
        System.out.println("Digite o número de horas trabalhadas no mês:");
        double horas = entrada.nextDouble();
        double salario = valorHora * horas;
        System.out.println("Salário bruto mensal:\n" + "R$ " + salario);
    }
}