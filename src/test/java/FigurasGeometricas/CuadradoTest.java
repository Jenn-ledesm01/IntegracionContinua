package FigurasGeometricas;

import org.example.FigurasGeometricas.Cubo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboTest {

    @org.junit.jupiter.api.Test
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
    void validadarVolumenCuadrado() {
        int resultado = Cubo.volumen(4);
        assertEquals(resultado, 64);
    }
}