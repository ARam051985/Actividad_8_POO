import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {
    @Test
    void probarEntradaNull() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] arregloNulo = {};
        arrayOperations.numZero(arregloNulo);
    }

    @Test
    void probarEntradaConNumerosSinCero() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] arregloConNumerosSinCero = {1, 2, 3, 4, 5};
        assertEquals(0, arrayOperations.numZero(arregloConNumerosSinCero));
    }

    @Test
    void probarEntradaConAlgunosCeros() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] arregloConAlgunosCeros = {0, 2, 0, 4, 0};
        assertEquals(3, arrayOperations.numZero(arregloConAlgunosCeros));
    }

    @Test
    void probarEntradaConPurosCeros() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] arregloConPurosCeros = {0, 0, 0, 0, 0};
        assertEquals(5, arrayOperations.numZero(arregloConPurosCeros));
    }

    @Test
    void probarResultadoEmpezandoEnElIndiceUno() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] arregloConPurosCeros = {0, 0, 0, 0, 0};
        assertEquals(4, arrayOperations.numZero(arregloConPurosCeros));
    }
}
