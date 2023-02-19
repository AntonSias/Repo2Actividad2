package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import parte2.Jugador;

class JugadorTest {

	@Test
	public void testPonerDorsal() {
	    Jugador j1 = new Jugador(5, 0, 0);
	    
	    //Introducimos un número entre 10 y 30
	    j1.ponerDorsal(10);
	    int resultadoEsperado = 10;
	    int resultadoObtenido = j1.getDorsal();
	    assertEquals(resultadoEsperado, resultadoObtenido);
	    
	    //Introducimos un número fuera del arco 10-30
	    j1.ponerDorsal(31);
	    int resultadoEsperado2 = -1;
	    int resultadoObtenido2 = j1.getDorsal();
	    assertEquals(resultadoEsperado2, resultadoObtenido2);
	}
	
	@Test 
	public void testEstaExpulsado() {
		Jugador j1 = new Jugador(5,0,0);
		
		//Ponemos a 0 el numero de trajetas del jugador y nos tendria que
		//dar que no está expulsado
		
		assertFalse(j1.estaExpulsado());
		
		//Ahora probaremos a ponerle solo 1 tarjeta amarilla, no debería estar expulsado
		j1.setNumeroTarjetasAmarillas(1);
		assertFalse(j1.estaExpulsado());
		
		//Add en 2 el número de tarjetas amarillas. Debería estar expulsado
		j1.setNumeroTarjetasAmarillas(2);
		assertTrue(j1.estaExpulsado());
		
		//Ponemos a 0 las tarjetas amarillas y add en 1 el numero de tarjetas rojas
		//Debería estar expulsado
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(1);
		assertTrue(j1.estaExpulsado());
		
		
	}

}
