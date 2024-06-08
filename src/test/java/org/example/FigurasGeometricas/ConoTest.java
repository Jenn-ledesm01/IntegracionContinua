package org.example.FigurasGeometricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConoTest {
    @Test
    public void testAreaBase() {
        double radio = 5.0;
        double areaEsperada = Math.PI * radio * radio;
        assertEquals(areaEsperada, Cono.areaBase(radio), 0.001);
    }

    @Test
    public void testPerimetroBase() {
        double radio = 5.0;
        double perimetroEsperado = 2 * Math.PI * radio;
        assertEquals(perimetroEsperado, Cono.perimetroBase(radio), 0.001);
    }

    @Test
    public void testVolumen() {
        double radio = 5.0;
        double altura = 10.0;
        double volumenEsperado = (1.0 / 3.0) * Math.PI * radio * radio * altura;
        assertEquals(volumenEsperado, Cono.volumen(radio, altura), 0.001);
    }
}