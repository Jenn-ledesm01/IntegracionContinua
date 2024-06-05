package org.example.FigurasGeometricas;

public class Rectangulo {

    public static Integer area(Integer ancho, Integer alto){
        return ancho * alto;
    }

    public static Integer perimetro(Integer ancho, Integer alto){
        return 2 * ancho + 2 * alto;
    }

    public static Integer volumen(Integer ancho, Integer alto, Integer largo){
        return largo * ancho * alto;
    }
}