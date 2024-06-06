package parcial2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TipoMotocicletaTest {
    // TODO: Descomenta el siguiente código una vez hayas completado el enumerado TipoMotocicleta
    /**
    @Test
    public void testEnumValues() {
        TipoMotocicleta[] expectedValues = {
            TipoMotocicleta.DEPORTIVA, 
            TipoMotocicleta.TOURING, 
            TipoMotocicleta.NAKED, 
            TipoMotocicleta.CAFE_RACER, 
            TipoMotocicleta.CRUISER, 
            TipoMotocicleta.SCOOTER, 
            TipoMotocicleta.ENDURO
        };
        assertEquals(7, TipoMotocicleta.values().length);
        assertEquals(expectedValues[0], TipoMotocicleta.values()[0]);
        assertEquals(expectedValues[1], TipoMotocicleta.values()[1]);
        assertEquals(expectedValues[2], TipoMotocicleta.values()[2]);
        assertEquals(expectedValues[3], TipoMotocicleta.values()[3]);
        assertEquals(expectedValues[4], TipoMotocicleta.values()[4]);
        assertEquals(expectedValues[5], TipoMotocicleta.values()[5]);
        assertEquals(expectedValues[6], TipoMotocicleta.values()[6]);
    }

    @Test
    public void testValueOf() {
        assertEquals(TipoMotocicleta.DEPORTIVA, TipoMotocicleta.valueOf("DEPORTIVA"));
        assertEquals(TipoMotocicleta.TOURING, TipoMotocicleta.valueOf("TOURING"));
        assertEquals(TipoMotocicleta.NAKED, TipoMotocicleta.valueOf("NAKED"));
        assertEquals(TipoMotocicleta.CAFE_RACER, TipoMotocicleta.valueOf("CAFE_RACER"));
        assertEquals(TipoMotocicleta.CRUISER, TipoMotocicleta.valueOf("CRUISER"));
        assertEquals(TipoMotocicleta.SCOOTER, TipoMotocicleta.valueOf("SCOOTER"));
        assertEquals(TipoMotocicleta.ENDURO, TipoMotocicleta.valueOf("ENDURO"));
    }

    @Test
    public void testValueOfInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            TipoMotocicleta.valueOf("TRAIL");
        });
    }

    @Test
    public void testToString() {
        assertEquals("DEPORTIVA", TipoMotocicleta.DEPORTIVA.toString());
        assertEquals("TOURING", TipoMotocicleta.TOURING.toString());
        assertEquals("NAKED", TipoMotocicleta.NAKED.toString());
        assertEquals("CAFE_RACER", TipoMotocicleta.CAFE_RACER.toString());
        assertEquals("CRUISER", TipoMotocicleta.CRUISER.toString());
        assertEquals("SCOOTER", TipoMotocicleta.SCOOTER.toString());
        assertEquals("ENDURO", TipoMotocicleta.ENDURO.toString());
    }

    @Test
    public void testNotNull() {
        assertNotNull(TipoMotocicleta.DEPORTIVA);
        assertNotNull(TipoMotocicleta.TOURING);
        assertNotNull(TipoMotocicleta.NAKED);
        assertNotNull(TipoMotocicleta.CAFE_RACER);
        assertNotNull(TipoMotocicleta.CRUISER);
        assertNotNull(TipoMotocicleta.SCOOTER);
        assertNotNull(TipoMotocicleta.ENDURO);
    }
    **/
}
