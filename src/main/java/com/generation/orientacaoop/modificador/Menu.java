package com.generation.orientacaoop.modificador;

public class Menu {      
    public static void main(String[] args) {

        Modificador modificador = new Modificador(); 

        modificador.nomePublico = "Nome Público";

        System.out.println(modificador.nomePublico);
    }
}