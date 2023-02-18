package Hsv;
/**
 * ---CREAMOS LA CALSE JUGADOR ---
 * 
 * @author HSV
 * 
 * @version 18/02/23
 *
 */
 public class Jugador {

 /**
 * ---CREAMOS LOS ATRIBUTOS DE LA CLASE SOLDADO---
 */	 
	 private int dorsal;

     private int numeroTarjetasAmarillas;

     private int numeroTarjetasRojas;

     
     
/***----------GETTER AND SETTER ----------***/
     
     
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	

/**
*  ---CREAMOS LOS METODOS DE LOS ATRIBUTOS ---
* 
*/
	
	
/**
 *---METODO ponerDorsal---
 * 
 *  Este metodo significa que si el jugador recibe un numero de dorsal lo llevara a 2 situaciones :
 *  
 *  1. Si el numero de dorsal esta >=0 y <=30 el resultado recibido  sera :
 *                         ->    @return dorsal
 *  2. Si el numero de dorsal sera =-1 entonces el resultado recibido sera :
 *                         ->   @return dorsal =-1                           
 * @param dorsal -> es un  objeto creado por el metodo
 */
	   public void ponerDorsal(int dorsal) {

           if(dorsal >= 1 && dorsal <= 30) {
                 this.dorsal = dorsal;

           }else {
                 this.dorsal = -1;
           }
     
	   }
 
/**
 * ----METODO estaExpulsado---
 * 	   
 *  Este metodo significa que el jugador puede pasar por dos situaciones specificadas :
 *  
 *  1. Si el jugador recibe 2 tarjetas amarillas,el jugador sera expulsado y el resultado recibido es  :
 *                                ->   @return TRUE
 *  2. Si el jugador rebibe 1 tarjeta roja , el jugador sera expulsado y el resultado recibido es :
 *                                ->   @return TRUE
 *   En cualquier otra situacion nespecificada en el metodo , el resultado recibido es : 
 *                                ->   @return EXPULSADO                                                             
 */
	   
	   
	   public boolean estaExpulsado() {

           boolean expulsado = false;                                                  

           if(numeroTarjetasAmarillas == 2) {
                expulsado = true;
           }
           
           if(numeroTarjetasRojas == 1) {
                expulsado = true;
           }                          
           return expulsado;

}            


 }
 
 
 
     

