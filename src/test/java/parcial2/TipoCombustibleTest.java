package parcial2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TipoCombustibleTest {
    // TODO: Descomenta el siguiente código una vez hayas completado el enumerado TipoCombustible
    /**
    @Test
    public void testEnumValues() {
        TipoCombustible[] expectedValues = {
            TipoCombustible.GASOLINA, 
            TipoCombustible.ELECTRICO, 
            TipoCombustible.HIBRIDO
        };
        assertEquals(3, TipoCombustible.values().length);
        assertEquals(expectedValues[0], TipoCombustible.values()[0]);
        assertEquals(expectedValues[1], TipoCombustible.values()[1]);
        assertEquals(expectedValues[2], TipoCombustible.values()[2]);
    }

    @Test
    public void testValueOf() {
        assertEquals(TipoCombustible.GASOLINA, TipoCombustible.valueOf("GASOLINA"));
        assertEquals(TipoCombustible.ELECTRICO, TipoCombustible.valueOf("ELECTRICO"));
        assertEquals(TipoCombustible.HIBRIDO, TipoCombustible.valueOf("HIBRIDO"));
    }

    @Test
    public void testValueOfInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            TipoCombustible.valueOf("DIESEL");
        });
    }

    @Test
    public void testToString() {
        assertEquals("GASOLINA", TipoCombustible.GASOLINA.toString());
        assertEquals("ELECTRICO", TipoCombustible.ELECTRICO.toString());
        assertEquals("HIBRIDO", TipoCombustible.HIBRIDO.toString());
    }

    @Test
    public void testNotNull() {
        assertNotNull(TipoCombustible.GASOLINA);
        assertNotNull(TipoCombustible.ELECTRICO);
        assertNotNull(TipoCombustible.HIBRIDO);
    }
    **/
}
