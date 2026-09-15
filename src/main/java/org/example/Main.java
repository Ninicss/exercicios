package org.example;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o cargo do funcionário:");
        String cargo = entrada.nextLine();
        if (cargo.equalsIgnoreCase("administrativo") || cargo.equalsIgnoreCase("liderança") || cargo.equalsIgnoreCase("lideranca")) {
            System.out.println("Você pode participar do programa de idiomas.");
        } else {
            System.out.println("Você não tem acesso ao programa de idiomas no momento.");
        }
    }
}