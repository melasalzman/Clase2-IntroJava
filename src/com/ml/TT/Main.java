package com.ml.TT;

public class Main {

    public static void main(String[] args) {

        try{
            Password password = new Password("[a-zA-Z0-9]{8}");
            password.setValue("123456aA");
            Password password1 = new PasswordSimple("^(?=\\w+[0-9a-zA-Z])(\\S){4,16}$");
            password1.setValue("123456aA");
            Password password2 = new PasswordIntermedia("^(?=\\w+[0-9])(?=\\w+[a-z])(\\S){6,16}$");
            password2.setValue("123456aA");
            Password password3 = new PasswordFuerte("^(?=\\w+[0-9])(?=\\w+[A-Z])(?=\\w+[a-z])(\\S){8}$");
            password3.setValue("aaaa");
        } catch (Exception e){
            e.printStackTrace();
        }


        Utils utils = new Utils();
        FiguraGeometrica[] arr = new FiguraGeometrica[5];
        FiguraGeometrica circulo1 = new Circulo(5);
        FiguraGeometrica circulo2 = new Circulo(5);
        FiguraGeometrica rectangulo = new Rectangulo(3,4);
        FiguraGeometrica triangulo1 = new Triangulo(4,5);
        FiguraGeometrica triangulo2 = new Triangulo(8,3);
        arr[0]=circulo1;
        arr[1]=circulo2;
        arr[2]=rectangulo;
        arr[3]=triangulo1;
        arr[4]=triangulo2;
        System.out.println("El area promedio es: " + utils.areaPromedio(arr));
    }




}
