package FigurasGeometricas;

import org.example.FigurasGeometricas.Circulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void validadarAreaCirculo() {
        double resultado = Circulo.area(4);
        double expected = Math.PI * Math.pow(4, 2);
        assertEquals(expected, resultado, 0.0001);
    }

    @Test
    void validadarPerimetroCirculo() {
        double resultado = Circulo.perimetro(5);
        double expected = 2 * Math.PI * 5;
        assertEquals(expected, resultado, 0.0001);
    }

    @Test
    void validadarVolumenEsfera() {
        double resultado = Circulo.volumen(4);
        double expected = (4/3.0) * Math.PI * Math.pow(4, 3);
        assertEquals(expected, resultado, 0.0001);
    }
}
