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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}