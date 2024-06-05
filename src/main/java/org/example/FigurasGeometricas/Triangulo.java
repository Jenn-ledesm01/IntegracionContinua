package org.example.FigurasGeometricas;

public class Triangulo {
    public static double area(double base, double altura) { return base * altura / 2; }

    public static double perimetro(double lado1, double lado2, double lado3) { return lado1 + lado2 + lado3; }

    public static double hipotenusa(double lado1, double lado2) {
        return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
    }
}
