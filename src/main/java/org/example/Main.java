package org.example;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Você possui veículo próprio? (sim/nao): ");
        String resposta  = entrada.nextLine();

        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Auxílio combustível disponível.");
        } else {
            System.out.println("Não possui auxílio combustível.");
        }
    }
}