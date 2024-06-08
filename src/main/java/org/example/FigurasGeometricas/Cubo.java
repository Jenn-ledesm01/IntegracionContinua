package org.example.FigurasGeometricas;

public class Cubo {
    public static Integer areaUnaCara(Integer lado){
        return lado * lado;
    }

    public static Integer perimetroUnaCara(Integer lado){
        return 4 * lado;
    }

    public static Integer volumen(Integer lado){ return lado * lado * lado; }
}
