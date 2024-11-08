package com.generation.orientacaoop.interfacepoli;

public class TelevisaoSansumg implements ControleRemoto {

    private boolean ligada;
    private int canal;
    private int volume;

    @Override
    public void ligar() {
        ligada = true;
        System.out.println("Ligando a TV Sansumg");
    }

    @Override
    public void desligar() {
        ligada = false;
        System.out.println("Desligando a TV Sansumg");
    }

    @Override
    public void mudarCanal(int canal) {
        if (ligada) {
            this.setCanal(canal);
            System.out.println("Mudando para o canal " + canal);
        } else {
            System.out.println("A TV Sansumg está desligada");
            return;
            
        }
    }

    @Override
    public void aumentarVolume() {
        if (ligada) {
            this.setVolume(this.volume++);
        } else {
            System.out.println("A TV Sansumg está desligada");
            return;
            
        }
    }

    @Override
    public void diminuirVolume() {
      if (ligada) {
            this.setVolume(volume--);
            
        } else {
            System.out.println("A TV Sansumg está desligada");
            return;
        
      }
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
