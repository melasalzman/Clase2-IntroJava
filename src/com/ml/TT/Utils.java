package com.ml.TT;

public class Utils {

    public static double areaPromedio(FiguraGeometrica arr[]){
        double acumArea = 0;
        for (FiguraGeometrica figuraGeometrica: arr) {
            acumArea += figuraGeometrica.area();
        }
        return acumArea/arr.length;
    }
}
