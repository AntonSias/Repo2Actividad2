package junit5;

import org.junit.jupiter.api.Test;

import Requirimiento1.Jugador;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

class JugadorTest {
	@Test
    public void testPonerDorsalValido() {
        Jugador jugador = new Jugador();
        jugador.ponerDorsal(5);
        assertEquals(5, jugador.getDorsal());
    }

    @Test
    public void testPonerDorsalInvalido() {
        Jugador jugador = new Jugador();
        jugador.ponerDorsal(50);
        assertEquals(-1, jugador.getDorsal());
    }

    @Test
    public void testEstaExpulsadoNoExpulsado() {
        Jugador jugador = new Jugador();
        jugador.setNumeroTarjetasAmarillas(1);
        jugador.setNumeroTarjetasRojas(0);
        assertFalse(jugador.estaExpulsado());
    }

    @Test
    public void testEstaExpulsadoAmarillas() {
        Jugador jugador = new Jugador();
        jugador.setNumeroTarjetasAmarillas(2);
        jugador.setNumeroTarjetasRojas(0);
        assertTrue(jugador.estaExpulsado());
    }

}










    
