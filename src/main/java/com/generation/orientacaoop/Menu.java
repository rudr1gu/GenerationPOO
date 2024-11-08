package com.generation.orientacaoop;

import java.util.Scanner;

import com.generation.orientacaoop.objeto.Gato;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        String cor;
        String raca;

        System.out.println("Digite o nome do gato: ");
        nome = scanner.nextLine();

        System.out.println("Digite a idade do gato: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a cor do gato: ");
        cor = scanner.nextLine();

        System.out.println("Digite a raça do gato: ");
        raca = scanner.nextLine();

        Gato gato = new Gato(nome, idade, cor, raca);

        gato.apresentar();

        scanner.close();
    }
}