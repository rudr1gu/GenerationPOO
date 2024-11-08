package com.generation.orientacaoop.herancaPolimorfismo;

public abstract class Transportes {
    private String nome;
    private String cor;
    private int capacidade;
    private double velocidadeMaxima;
    private int qntdRodas;

    public Transportes(String nome, String cor, int capacidade, double velocidadeMaxima, int qntdRodas) {
        this.nome = nome;
        this.cor = cor;
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
        this.qntdRodas = qntdRodas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getQntdRodas() {
        return qntdRodas;
    }

    public void setQntdRodas(int qntdRodas) {
        this.qntdRodas = qntdRodas;
    }

    public void visualizar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Quantidade de Rodas: " + this.qntdRodas);
    }
}