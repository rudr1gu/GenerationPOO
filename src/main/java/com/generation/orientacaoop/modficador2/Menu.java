package com.generation.orientacaoop.modficador2;

import com.generation.orientacaoop.modificador.Modificador;

public class Menu {
    
    public static void main(String[] args) {

        Modificador modificador = new Modificador(); 

        modificador.nomePublico = "Nome Público";

        System.out.println(modificador.nomePublico);
    }

}
