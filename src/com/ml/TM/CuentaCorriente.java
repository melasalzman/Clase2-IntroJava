package com.ml.TM;

public class CuentaCorriente {
    private String nombre;
    private double saldo;
    private String numeroCuenta;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public CuentaCorriente(){
        setNombre("");
        setNumeroCuenta("");
        setSaldo(0);
    }

    public CuentaCorriente(String nombre, String numeroCuenta, double saldo){
        setNombre(nombre);
        setNumeroCuenta(numeroCuenta);
        setSaldo(saldo);
    }
    public CuentaCorriente(CuentaCorriente cuenta){
        setNombre(cuenta.getNombre());
        setNumeroCuenta(cuenta.getNumeroCuenta());
        setSaldo(cuenta.getSaldo());
    }
    public void ingreso(double valor){
        setSaldo(this.saldo+valor);
    }
    public void egreso(double valor){
        setSaldo(this.saldo-valor);
    }
    public void reintegro(double val){
        this.ingreso(val);
    }
    public void transferencia(double valor, CuentaCorriente destino){
        this.egreso(valor);
        destino.ingreso(valor);
    }
}
