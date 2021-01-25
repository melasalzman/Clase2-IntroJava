package com.ml.TM;

public class Contador {

    private int valor;

    public Contador(){
        setValor(0);
    }

    public Contador(int valor){
        setValor(valor);
    }

    public Contador(Contador contador){
        this.setValor(contador.getValor());
    }

    public void incrementar(){
        this.setValor(valor+1);
    }

    public void decrementar(){
        this.setValor(valor-1);
    }

    public int getValor(){
        return this.valor;
    }

    public void setValor(int valor){
        this.valor=valor;
    }
}
