package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade total de segundos:");
        int totalSegundos = entrada.nextInt();
        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
    }
}