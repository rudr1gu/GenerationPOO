package com.generation.orientacaoop.objeto;

public class Gato {
    private String nome;
    private int idade;
    private String cor;
    private String raca;

    public Gato(String nome, int idade, String cor, String raca) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCor(cor);
        this.setRaca(raca);
    }

    public void miar() {
        System.out.println("Miau Miau");
    }

    public void dormir() {
        System.out.println("Zzzzzzz");
    }

    public void comer() {
        System.out.println("Nhac Nhac");
    }

    public void brincar() {
        System.out.println("Brincando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void apresentar() {
        System.out.println("Gato\nNome: " + this.getNome() + "\nidade: " + this.getIdade() + "\ncor: " + this.cor + "\nraça: " + this.getRaca()); 
    }  
}