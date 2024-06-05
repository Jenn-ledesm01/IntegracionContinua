package org.example.FigurasGeometricas;

public class Circulo {
    public static double area(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double perimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double volumen(double radio) {
        return (4/3.0) * Math.PI * Math.pow(radio, 3);
    }
}
