package FigurasGeometricas;

import org.example.FigurasGeometricas.Rectangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    @Test
    void validadrAreaRectangulo(){
        int resultado = Rectangulo.area(3,4);
        assertEquals(resultado, 12);
    }
    @Test
    void validarPerimetroRectangulo(){
        int resultado = Rectangulo.perimetro(3,4);
        assertEquals(resultado, 14);
    }
    @Test
    void validarVolumenRectangulo(){
        int resultado = Rectangulo.volumen(3,4,5);
        assertEquals(resultado,60 );
    }
}