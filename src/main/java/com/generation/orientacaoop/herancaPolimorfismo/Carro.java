package com.generation.orientacaoop.herancaPolimorfismo;

public class Carro extends Transportes{
    private int qntdPortas;
    private String placa;

    public Carro(String nome, String cor, int capacidade, double velocidadeMaxima, int qntdRodas, int qntdPortas, String placa) {
        super(nome, cor, capacidade, velocidadeMaxima, qntdRodas);
        this.qntdPortas = qntdPortas;
        this.placa = placa;
    }

    public int getQntdPortas() {
        return qntdPortas;
    }

    public void setQntdPortas(int qntdPortas) {
        this.qntdPortas = qntdPortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Quantidade de portas: " + this.qntdPortas);
        System.out.println("Placa: " + this.placa);
    }
}