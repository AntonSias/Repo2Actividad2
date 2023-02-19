package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import parte1.Soldado;

class SoldadoTest {
	
	 

	@Test
	public void testPuedeDisparar() {
		Soldado sol = new Soldado(false,10);
		
		System.out.println(sol.puedeDisparar());
		
		//Esperamos que al tener 10 balas el metodo nos devuelva un true
		assertTrue(sol.puedeDisparar());
		
		//Cambiamos a 0 el número de balas y esperamos que el método nos de false
		sol.setNumeroBalas(0);
		assertFalse(sol.puedeDisparar());
		
		//Probamos con un número negativo, tendría que dar false
		sol.setNumeroBalas(-1);
		assertFalse(sol.puedeDisparar());
		
	}
	
	@Test
	public void testDisparar() {
	    Soldado horda = new Soldado(false, 10);
	    Soldado alianza = new Soldado(true, 5);

	    horda.disparar(alianza);

	    //Comprobamos que se le resta en 1 el número de balas a nuestro objeto Soldado horda
	    int resultadoEsperado = 9;
	    int resultadoObtenido = horda.getNumeroBalas();
	    assertEquals(resultadoEsperado, resultadoObtenido);

	    //Comprobamos que el objeto Soldado alianza ahora pasa a estar a true
	    assertTrue(alianza.getEstaMuerto());
	}

}
