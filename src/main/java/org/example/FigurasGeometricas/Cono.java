package org.example.FigurasGeometricas;

public class Cono {

    //prueba GithubActions

    public static double areaBase(double radio) {
        return Math.PI * radio * radio;
    }

    public static double perimetroBase(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double volumen(double radio, double altura) {
        return (1.0 / 3.0) * areaBase(radio) * altura;
    }
}



