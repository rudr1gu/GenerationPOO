package com.generation.orientacaoop.interfacepoli;

public class TelevisaoLG implements ControleRemoto, Conectividade {
    private boolean ligada;
    private int canalAtual;
    private int volume;

    public TelevisaoLG() {
        this.ligada = false;
        this.canalAtual = 0;
        this.volume = 0;
    }

    @Override
    public void ligar() {
        this.ligada = true;
        System.out.println("Ligando a TV");
    }

    @Override
    public void desligar() {
        this.ligada = false;
        System.out.println("Desligando a TV");
    }

    @Override
    public void mudarCanal(int canal) {
        if (ligada) {
            this.setCanalAtual(canal);
            System.out.println("Canal atual: " + this.getCanalAtual());
        } else {
            System.out.println("A TV está desligada");
            
        }
    }

    @Override
    public void aumentarVolume() {
        if (ligada) {
            this.setVolume(this.volume++);
        } else {
            System.out.println("A TV está desligada");
            
        }
    }

    @Override
    public void diminuirVolume() {
        if (ligada) {
            this.volume--;
        } else {
            System.out.println("A TV está desligada");
            
        }
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getcanaAtual() {
        return canalAtual;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando a TV na rede Wifi");
    }

    @Override
    public void conectarBluetooth() {
       System.out.println("Conectando a TV no Bluetooth");
    }

    @Override
    public void conectarUsb() {
        System.out.println("Conectando a TV na porta USB");
    }

    @Override
    public void conectarHdmi() {
        System.out.println("Conectando a TV na porta HDMI");
    }

}