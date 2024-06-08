package org.example.FigurasGeometricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboTest {
    @Test
    void validadarAreaCuadrado() {
        int resultado = Cubo.areaUnaCara(4);
        assertEquals(resultado, 16);
    }

    @Test
    void validadarPerimetroCuadrado() {
        int resultado = Cubo.perimetroUnaCara(5);
        assertEquals(resultado, 20);
    }

    @Test
    void validadarVolumenCubo() {
        int resultado = Cubo.volumen(4);
        assertEquals(resultado, 64);
    }
}