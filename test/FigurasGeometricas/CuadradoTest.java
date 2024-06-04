package FigurasGeometricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {

    @org.junit.jupiter.api.Test
    void validadarAreaCuadrado() {
        int resultado = Cuadrado.area(4);
            assertEquals(resultado, 16);
    }

    @Test
    void validadarPerimetroCuadrado() {
        int resultado = Cuadrado.perimetro(5);
        assertEquals(resultado, 20);
    }

    @Test
    void validadarVolumenCuadrado() {
        int resultado = Cuadrado.volumen(4);
        assertEquals(resultado, 64);
    }
}