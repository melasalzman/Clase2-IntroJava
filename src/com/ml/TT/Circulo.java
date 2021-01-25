package com.ml.TT;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(double radio){
        setRadio(radio);
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(this.radio,2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
