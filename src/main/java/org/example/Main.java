package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do lado em metros:");
        double base = entrada.nextDouble();
        double area = base * base;
        System.out.println("Área do quadrado:\n" + area + " m²");
    }
}