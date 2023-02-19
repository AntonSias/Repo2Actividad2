package Junit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Hsv.Jugador;

class TestJugador {

	

 //--- PRIMER CASO ES CUANDO EL JUGADOR PONE UN DORSAL DENTRO DEL RANGO : 1 AL 30 ---//
	@Test
	public void testPonerDorsal() {
		Jugador jugador1 = new Jugador();
		jugador1.setDorsal(4);
		int resultadoEsprerado=(4);
		int resultadoObtenido=jugador1.getDorsal();
		assertEquals( resultadoEsprerado, resultadoObtenido);
	}
	
//---SEGUNDO CASO ES CUNADO EL JUGADOR PONE UN DORSAL FUERA DEL RANGO : DORSAL > 30---//
	
	@Test
	public void testPonerDorsalAltoDeRango() {
		Jugador jugador1 = new Jugador();
		jugador1.setDorsal(40);
		int resultadoEsprerado=(40);
		int resultadoObtenido=jugador1.getDorsal();
		assertEquals( resultadoEsprerado, resultadoObtenido);
	}
	
//---EL TERCER CASO ES CUNADO EL JUGADOR TIENE  UNA TARJETA ROJA---//
	@Test
	public void testEstaExpulsadoTarjetaRoja() {
		Jugador jugador1 = new Jugador();
	    jugador1.setNumeroTarjetasRojas(1);
	    assertTrue(jugador1.estaExpulsado());
	}
	
//---EL CUARTO CASO ES CUANDO EL JUGADOR RECIBE 0 O MAS TARJETAS AMARILLAS---//

	@Test
	public void testEstaExpulsadoTarjetaAmarilla() {
		Jugador jugador1 = new Jugador();
 //-* ESTA ES LA SITUACION EN QUE EL JUGADOR NO SERA EXPULADO POR TENER 0 TARJETAS AMARILLAS *-// 
		jugador1.setNumeroTarjetasAmarillas(0);
	    assertFalse(jugador1.estaExpulsado());
 //-* ESTE ES LA SITUACION EN QUE EL JUGEADO SERA EXPULSADO POR RECIBIR 2 O MAS TRAJETAS AMARILLA -*//	    
	    jugador1.setNumeroTarjetasAmarillas(2);
	    assertTrue(jugador1.estaExpulsado());
	    
	}
	
	
	
	
	
	
	
	
	
	
	   }















