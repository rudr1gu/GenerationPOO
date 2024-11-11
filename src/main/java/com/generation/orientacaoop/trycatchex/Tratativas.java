package com.generation.orientacaoop.trycatchex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratativas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dividendo = 0;
        int divisor = 0;
        boolean valido = true;

        do {
            try {
                System.out.println("Digite o dividendo: ");
                dividendo = scanner.nextInt();

                System.out.println("Digite o divisor: ");
                divisor = scanner.nextInt();

            } catch (InputMismatchException e) {
                System.err.println("Erro: Digite apenas números inteiros. Tente novamente.");
                scanner.nextLine();
            }
            try {
                divisao(dividendo, divisor);
                valido = false;
            } catch (ArithmeticException e) {
                System.err.println("Erro: Divisão por zero não é permitida. Tente novamente.");
            }
            
        } while (valido);

        scanner.close();
    }

    public static void divisao(int a, int b) {
        System.out.println("Resultado: " + (a / b));
    }
}