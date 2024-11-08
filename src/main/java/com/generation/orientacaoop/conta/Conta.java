package com.generation.orientacaoop.conta;

public class Conta {

    private String nome;
    private int numero;
    private int agencia;
    private int tipo;
    private double saldo;

    public Conta(String nome, int numero, int agencia, int tipo, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.saldo = saldo;
    }
}