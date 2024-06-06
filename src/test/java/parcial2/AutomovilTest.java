package parcial2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AutomovilTest {
    // TODO: Descomenta el siguiente código una vez hayas completado la clase Automovil
    /**
    private Automovil automovil;

    @BeforeEach
    public void setUp() {
        automovil = new Automovil("Honda", "Civic", 2019, 4, TipoCombustible.GASOLINA);
    }

    @Test
    public void testAutomovilCreation() {
        assertNotNull(automovil, "El objeto Automovil no debería ser null");
        assertEquals("Honda", automovil.getMarca());
        assertEquals("Civic", automovil.getModelo());
        assertEquals(2019, automovil.getAño());
        assertEquals(4, automovil.getNumeroPuertas());
        assertEquals(TipoCombustible.GASOLINA, automovil.getTipoCombustible());
    }

    @Test
    public void testImprimirInformacion() {
        String expectedOutput = "Honda Civic 2019, 4 puertas, combustión a GASOLINA";
        assertEquals(expectedOutput, automovil.imprimirInformacion());
    }

    @Test
    public void testGettersAndSetters() {
        automovil.setMarca("Toyota");
        automovil.setModelo("Corolla");
        automovil.setAño(2020);
        automovil.setNumeroPuertas(5);
        automovil.setTipoCombustible(TipoCombustible.HIBRIDO);

        assertEquals("Toyota", automovil.getMarca());
        assertEquals("Corolla", automovil.getModelo());
        assertEquals(2020, automovil.getAño());
        assertEquals(5, automovil.getNumeroPuertas());
        assertEquals(TipoCombustible.HIBRIDO, automovil.getTipoCombustible());
    }

    @Test
    public void testSetNumeroPuertas() {
        automovil.setNumeroPuertas(2);
        assertEquals(2, automovil.getNumeroPuertas());
    }

    @Test
    public void testSetTipoCombustible() {
        automovil.setTipoCombustible(TipoCombustible.ELECTRICO);
        assertEquals(TipoCombustible.ELECTRICO, automovil.getTipoCombustible());
    }
    **/
}
