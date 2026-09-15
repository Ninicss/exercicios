package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = entrada.nextInt();
        System.out.println("Digite o valor de B:");
        int b = entrada.nextInt();

        System.out.println("Valores antes da troca:\nA: " + a + "\nB: " + b);

        int aux = a;
        a = b;
        b = aux;

        System.out.println("Valores depois da troca:\nA: " + a + "\nB: " + b);
    }
}