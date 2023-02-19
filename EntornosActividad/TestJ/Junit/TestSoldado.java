package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Hsv.Soldado;

public class TestSoldado {
	
	
	
	
//--- TREBAJAMOS EN EL METODO DISPARAR DONDE TENEMOS 2 SITUACIONES---//
	
  //-* LA  PRIMERA SITUACION ES CUANDO EL SOLDADO PUEDE DISPARAR CON 0  BALAS -*//
	@Test
	public void testDispararBalas_0() {
		Soldado sol=new Soldado();
		sol.setNumeroBalas(0);
		int resultadoEsperado= (0);
		int resultadoObtenido=sol.getNumeroBalas();
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
 //-* EL SEGUNDO CASO ES CUANDO EL SOLDADO PUEDE DISPARAR CON MAS DE 0 BALAS *-//
	
	@Test
	public void testDispararBalas_MasBalas() {
		Soldado sol=new Soldado();
		sol.setNumeroBalas(10);
		int resultadoEsperado= (10);
		int resultadoObtenido=sol.getNumeroBalas();
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
//---TRABAJAMOS EN EL METODO PUEDEDISPARAR DONDE TENEMOS 2 SITUACIONES---//
	
//-* LA PRIMERA SITUACION ES CUANDO EL SOLDADO RECIBE UN NUMEO DE  BALAS > O Y RESULTA MUERTO *-//
	@Test
	  public void testPuedeDispararMuerto() {
		  Soldado sol= new Soldado();
	      sol.setNumeroBalas(2);
	      int resultadoEsperado=2;
	      int resultadoObtenido=sol.getNumeroBalas();
	      assertEquals(resultadoObtenido, resultadoEsperado);  
	}
	 
//-* LA SEGUNDA SITUACION ES CUANDO EL SOLDADO RECIBE 0 NUMEROS DE BALLAS *-//

	@Test
	  public void testPuedeDispararNoPuedeMorir() {
		  Soldado sol= new Soldado();
	      sol.setNumeroBalas(0);
	      int resultadoEsperado=0;
	      int resultadoObtenido=sol.getNumeroBalas();
	      assertEquals(resultadoObtenido, resultadoEsperado);  
	}

















}
	
	
	
	
	
	


