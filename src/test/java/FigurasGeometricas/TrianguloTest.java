package FigurasGeometricas;
import org.example.FigurasGeometricas.Triangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {
    @Test
    void validarAreaTriangulo() {
        double resultado = Triangulo.area(4, 5);
        double expected = (double) (4 * 5) / 2;
        assertEquals(expected, resultado);
    }

    @Test
    void validarPerimetroTriangulo() {
        double resultado = Triangulo.perimetro(2, 3, 4);
        double expected = 2 + 3 + 4;
        assertEquals(expected, resultado);
    }

    @Test
    void validarHipotenusa() {
        double resultado = Triangulo.hipotenusa(4, 7);
        double expected = Math.sqrt(Math.pow(4, 2) + Math.pow(7, 2));
        assertEquals(expected, resultado);
    }
}
