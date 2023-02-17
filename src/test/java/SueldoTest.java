import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SueldoTest {
    @Test
    void sueldo() {
        assertNotEquals(1000, Sueldo.sueldo('N', 1000, 1));
        // Este método falla debido a que el sueldo no se modifica, y el resultado esperado es que este se modifique
        // Esto ocurre debido a que el incremento siempre es 0.0 (porque siempre va al default) y al multiplicarlo por la antiguedad
        // se queda en 0, por lo que no se incrementa el valor
    }

    @Test
    void sueldo2(){
        assertNotEquals(1001, Sueldo.sueldo('E', 1001, 1));
        // Este método falla debido a que el sueldo no se modifica, y el resultado esperado es que este se modifique
        // Esto ocurre debido a que el incremento siempre es 0.0 (porque siempre va al default) y al multiplicarlo por la antiguedad
        // se queda en 0, por lo que no se incrementa el valor
    }

    @Test
    void sueldo3(){
        assertEquals(1000, Sueldo.sueldo('R', 1000, 1));
    }

    @Test
    void sueldo4(){
        assertEquals(1000, Sueldo.sueldo('N', 1000, 0));
    }

    @Test
    void sueldo5(){
        assertEquals(999, Sueldo.sueldo('N', 999, 1));
    }
}