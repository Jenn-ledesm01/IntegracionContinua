package org.example.FigurasGeometricas;

public class Cuadrado {

    public static Integer area(Integer lado){
        return lado * lado;
    }

    public static Integer perimetro(Integer lado){
        return 4 * lado;
    }

    public static Integer volumen(Integer lado){ return lado * lado * lado; }
}