package junit5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import Requirimiento1.Soldado; 
class SoldadoTest {

    @Test
    public void testPuedeDispararConBalas() {
        Soldado soldado = new Soldado();
        soldado.setNumeroBalas(1);
        assertTrue(soldado.puedeDisparar());
    }

    @Test
    public void testPuedeDispararSinBalas() {
        Soldado soldado = new Soldado();
        soldado.setNumeroBalas(0);
        assertFalse(soldado.puedeDisparar());
    }

    @Test
    public void testDisparar() {
        Soldado soldado1 = new Soldado();
        Soldado soldado2 = new Soldado();
        soldado1.setNumeroBalas(1);
        
        soldado1.disparar(soldado2);
       
        assertEquals(0, soldado1.getNumeroBalas());
    }

    @Test
    public void testSetAndGetNumeroBalas() {
        Soldado soldado = new Soldado();
        soldado.setNumeroBalas(1);
        assertEquals(1, soldado.getNumeroBalas());
    }

    @Test
    public void testSetAndGetEstaMuerto() {
        Soldado soldado = new Soldado();
       
    }
}


