package org.example.FigurasGeometricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PiramideTest {
    @Test
    void validarAreaBasePiramide() {
        double resultado = Piramide.areaBase(4.0);
        assertEquals(16.0, resultado, 0.001);
    }

    @Test
    void validarPerimetroBasePiramide() {
        double resultado = Piramide.perimetroBase(5.0);
        assertEquals(20.0, resultado, 0.001);
    }

    @Test
    void validarVolumenPiramide() {
        double resultado = Piramide.volumen(4.0, 6.0);
        assertEquals(32.0, resultado, 0.001);
    }
}