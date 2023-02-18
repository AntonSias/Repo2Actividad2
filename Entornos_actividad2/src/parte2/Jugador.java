package parte2;
/**
 * Creamos la clase Jugador de la cual vamos a poder crear objetos con los que pododremos darle un número de  
 * dorsal o saber si están expulsados
 * 
 * @author Antón
 * @version 1.0
 * 
 */
public class Jugador {
	
	//ATRIBUTOS
	private int dorsal;

    private int numeroTarjetasAmarillas;

    private int numeroTarjetasRojas;
    
    
    // GETTERS & SETTERS
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
	
	//METODOS 
	/**
	 * Este método verificará que el parámetro que le pasemos esté comprendido entre los número 1 y 30. Si el parámetro
	 * se encuentra entre estos dos valores se le añadirá  al atributo dorsal del objeto Jugador. 
	 * Si el parámetro introducido sale del arco de estos dos valores el dorsal del objeto Jugador pasará a ser -1.
	 * 
	 *
	 * @param dorsal El parámetro dorsal será el numeral que queremos que nuestro objeto Jugador lleve 
	 * en el atributo dorsal
	 */
	public void ponerDorsal(int dorsal) {

         if(dorsal >= 1 && dorsal <= 30) {

                       this.dorsal = dorsal;

         }else {

                       this.dorsal = -1;

         }

	}


	/**
	 * Este método nos indica si el objeto Jugador está expulsado o no. 
	 * Si el jugador tiene un número de tarjetas amarillas igual a 2, el jugador está expulsado.
	 * Si el jugador tiene un número de tarjetas rojas igual a 1, el jugador está expulsado.
	 * Si el número de tarjetas es menor a los valores anteriores, el jugador no está expulsado. 
	 * 
	 * @return true si el numeroTarjetasAmarillas es igual a 2 o el numeroTarjetasRojas es igual a 1, false
	 * si el numero de tarjetas es diferente a los valores anteriores.
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
