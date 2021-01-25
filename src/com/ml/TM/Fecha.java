package com.ml.TM;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Fecha {
    private GregorianCalendar fecha;

    public Fecha() {
        setFecha(new GregorianCalendar());
    }

    public Fecha(int dia, int mes, int anio){
        if(esFechaValida(dia,mes,anio))
        setFecha(new GregorianCalendar(anio,mes,dia));
        else{
            System.out.println("La fecha no es valida");
        }
    }

    @Override
    public String toString() {
        String mes = fecha.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
       return fecha.get(Calendar.DAY_OF_MONTH) + " de " + mes + " de " + fecha.get(Calendar.YEAR);
    }

    public void sumarUnDia(){
        this.fecha.add(Calendar.DAY_OF_MONTH,1);
    }

    public Boolean esFechaValida(int dia, int mes, int anio){
        return dia<32&&dia>0&&mes>0&&mes<13&&anio>0;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }
}
