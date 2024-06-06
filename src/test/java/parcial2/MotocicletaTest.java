package parcial2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MotocicletaTest {
    // TODO: Descomenta el siguiente código una vez hayas completado la clase Motocicleta
    /**
    private Motocicleta motocicleta;

    @BeforeEach
    public void setUp() {
        motocicleta = new Motocicleta("Yamaha", "YZF-R3", 2021, TipoMotocicleta.DEPORTIVA);
    }

    @Test
    public void testMotocicletaCreation() {
        assertNotNull(motocicleta, "El objeto Motocicleta no debería ser null");
        assertEquals("Yamaha", motocicleta.getMarca());
        assertEquals("YZF-R3", motocicleta.getModelo());
        assertEquals(2021, motocicleta.getAño());
        assertEquals(TipoMotocicleta.DEPORTIVA, motocicleta.getTipoMotocicleta());
    }

    @Test
    public void testImprimirInformacion() {
        String expectedOutput = "Yamaha YZF-R3 2021, tipo de motocicleta: DEPORTIVA";
        assertEquals(expectedOutput, motocicleta.imprimirInformacion());
    }

    @Test
    public void testGettersAndSetters() {
        motocicleta.setMarca("Honda");
        motocicleta.setModelo("CBR500R");
        motocicleta.setAño(2022);
        motocicleta.setTipoMotocicleta(TipoMotocicleta.TOURING);

        assertEquals("Honda", motocicleta.getMarca());
        assertEquals("CBR500R", motocicleta.getModelo());
        assertEquals(2022, motocicleta.getAño());
        assertEquals(TipoMotocicleta.TOURING, motocicleta.getTipoMotocicleta());
    }

    @Test
    public void testSetTipoMotocicleta() {
        motocicleta.setTipoMotocicleta(TipoMotocicleta.CAFE_RACER);
        assertEquals(TipoMotocicleta.CAFE_RACER, motocicleta.getTipoMotocicleta());
    }
    **/
}
