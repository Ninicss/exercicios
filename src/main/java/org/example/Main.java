package org.example;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tempo de contratação (meses): ");
        double tempo = entrada.nextDouble();


        if (tempo >= 3) {
            System.out.println("O plano de saúde  está disponível para você.");
        } else {
            System.out.println("Serviço não disponível para você.");
        }
    }
}