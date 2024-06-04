package FigurasGeometricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    @Test
    void validadrAreaRectangulo(){
        int resultado = Rectangulo.area(3,4);
        assertEquals(resultado, 12);
    }
    void validarPerimetroRectangulo(){
        int resultado = Rectangulo.perimetro(3,4);
        assertEquals(resultado, 14);
    }
    void validarVolumenRectangulo(){
        int resultado = Rectangulo.volumen(3,4,5);
        assertEquals(resultado,60 );
    }
}