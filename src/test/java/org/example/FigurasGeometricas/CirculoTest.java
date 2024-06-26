package org.example.FigurasGeometricas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void validarAreaCirculo() {
        double resultado = Circulo.area(4);
        double expected = Math.PI * Math.pow(4, 2);
        assertEquals(expected, resultado, 0.0001);
    }

    @Test
    void validarPerimetroCirculo() {
        double resultado = Circulo.perimetro(5);
        double expected = 2 * Math.PI * 5;
        assertEquals(expected, resultado, 0.0001);
    }

    @Test
    void validarVolumenEsfera() {
        double resultado = Circulo.volumen(4);
        double expected = (4 / 3.0) * Math.PI * Math.pow(4, 3);
        assertEquals(expected, resultado, 0.0001);
    }
}
