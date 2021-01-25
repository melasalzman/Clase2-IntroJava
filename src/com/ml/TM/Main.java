package com.ml.TM;

public class Main {

    public static void main(String[] args) {

        System.out.println("Utilizando la cuenta corriente");
        CuentaCorriente cuenta1 = new CuentaCorriente("Juan Perez", "1234", 13000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Maria Laura", "3435", 20000);

        System.out.println("Cuenta 1= " + "nombre " + cuenta1.getNombre() + ", cuenta " + cuenta1.getNumeroCuenta() + ", saldo " + cuenta1.getSaldo());
        System.out.println("Cuenta 2= " + "nombre " + cuenta2.getNombre() + ", cuenta " + cuenta2.getNumeroCuenta() + ", saldo " + cuenta2.getSaldo());

        System.out.println("Ingreso $3000 en cuenta 1: ");
        cuenta1.ingreso(3000);
        System.out.println("Cuenta 1= " + "saldo " + cuenta1.getSaldo());

        System.out.println("Egreso $10000 en cuenta 2: ");
        cuenta2.egreso(10000);
        System.out.println("Cuenta 2= " + "saldo " + cuenta2.getSaldo());

        System.out.println("Transfiero $5000 de cuenta 1 a 2: ");
        cuenta1.transferencia(5000,cuenta2);
        System.out.println("Cuenta 1= " + "saldo " + cuenta1.getSaldo());
        System.out.println("Cuenta 2= " + "saldo " + cuenta2.getSaldo());

        System.out.println("Reintegro $1500 en cuenta1");
        cuenta1.reintegro(1500);
        System.out.println("Cuenta 1= " + "saldo " + cuenta1.getSaldo());
        System.out.println("------------------------------------------");

        System.out.println("Utilizando el contador");
        Contador contador = new Contador();
        System.out.println("Contador= " + contador.getValor());
        System.out.println("Incremento");
        contador.incrementar();
        System.out.println("Contador= " + contador.getValor());
        System.out.println("Incremento");
        contador.incrementar();
        System.out.println("Contador= " + contador.getValor());
        System.out.println("Decremento");
        contador.decrementar();
        System.out.println("Contador= " + contador.getValor());
        System.out.println("Seteo el contador en 3");
        contador.setValor(3);
        System.out.println("Contador= " + contador.getValor());
        System.out.println("Incremento");
        contador.incrementar();
        System.out.println("Contador= " + contador.getValor());
        System.out.println("------------------------------------------");

        System.out.println("Utilizando la clase Libro");
        System.out.println("Creo libro sin parametros");
        Libro libro = new Libro();
        System.out.println(libro.toString());
        System.out.println("Seteo los parametros de libro");
        libro.setAutor("Robert C. Martin");
        libro.setTitulo("Clean Code");
        libro.setIsbn("9780132350884");
        libro.setEstadoLibro(EstadoLibro.DISPONIBLE);
        System.out.println(libro.toString());
        System.out.println("Presto el libro");
        libro.prestamo();
        System.out.println(libro.toString());
        System.out.println("Devuelvo el libro");
        libro.devolucion();
        System.out.println(libro.toString());
        System.out.println("------------------------------------------");

        System.out.println("Trabajando con fracciones");
        Fraccion fraccion = new Fraccion();
        double num1 = 4.5;
        double num2 = 4/3;
        int num3 = 2;
        int num4 = 5;

        System.out.println("Suma: " + num1 + " + " + num2 + " = " + fraccion.sumar(num1,num2));
        System.out.println("Suma: " + num1 + " + " + num3 + " = " + fraccion.sumar(num1,num3));
        System.out.println("Suma: " + num4 + " + " + num2 + " = " + fraccion.sumar(num4,num2));
        System.out.println("Suma: " + num3 + " + " + num4 + " = " + fraccion.sumar(num3,num4));

        System.out.println("Resta: " + num1 + " - " + num2 + " = " + fraccion.restar(num1,num2));
        System.out.println("Resta: " + num1 + " - " + num3 + " = " + fraccion.restar(num1,num3));
        System.out.println("Resta: " + num4 + " - " + num2 + " = " + fraccion.restar(num4,num2));
        System.out.println("Resta: " + num3 + " - " + num4 + " = " + fraccion.restar(num3,num4));

        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + fraccion.multiplicar(num1,num2));
        System.out.println("Multiplicación: " + num1 + " * " + num3 + " = " + fraccion.multiplicar(num1,num3));
        System.out.println("Multiplicación: " + num4 + " * " + num2 + " = " + fraccion.multiplicar(num4,num2));
        System.out.println("Multiplicación: " + num3 + " * " + num4 + " = " + fraccion.multiplicar(num3,num4));

        System.out.println("División: " + num1 + " / " + num2 + " = " + fraccion.dividir(num1,num2));
        System.out.println("División: " + num1 + " / " + num3 + " = " + fraccion.dividir(num1,num3));
        System.out.println("División: " + num4 + " / " + num2 + " = " + fraccion.dividir(num4,num2));
        System.out.println("División: " + num3 + " / " + num4 + " = " + fraccion.dividir(num3,num4));
        System.out.println("------------------------------------------");

        System.out.println("Trabajando con fecha");
        System.out.println("Obtener fecha actual");
        Fecha fecha = new Fecha();
        System.out.println(fecha.toString());
        System.out.println("Sumar un día");
        fecha.sumarUnDia();
        System.out.println(fecha.toString());
        System.out.println("Crear fecha 40/3/2021");
        Fecha fecha2 = new Fecha(40,3,2021);
        System.out.println("------------------------------------------");

        System.out.println("Trabajando con StringUtil");
        System.out.println("rPad");
        StringUtil stringUtil = new StringUtil();
        System.out.println(stringUtil.rpad("Hola",'F',10));

        System.out.println("lTrim");
        System.out.println(stringUtil.ltrim("     sinespacioizquierda"));

        System.out.println("rTrim");
        System.out.println(stringUtil.rtrim("sinespacioderecha     "));

        System.out.println("trim");
        System.out.println(stringUtil.ltrim("     sinespaciosderechaeizquierda         "));

        System.out.println("indexOfN");
        System.out.println(stringUtil.indexOfN("John|Paul|George|Ringo",'|',2));

        System.out.println("------------------------------------------");

    }
}
