package org.example.FigurasGeometricas;

public class Piramide {

    public static double areaBase(double lado) {
        return lado * lado;
    }

    public static double perimetroBase(double lado) {
        return 4 * lado;
    }

    public static double volumen(double lado, double altura) {
        return (1.0 / 3.0) * areaBase(lado) * altura;
    }
}

