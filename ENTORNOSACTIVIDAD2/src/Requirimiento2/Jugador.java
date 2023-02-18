package Requirimiento2;
/**
 * @autor Minerva
 * version 1.0.
 */

public class Jugador {

    private int dorsal;

    private int numeroTarjetasAmarillas;

    private int numeroTarjetasRojas;

    
    //creamos los getter and setter//
    
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
    
   //Métodos//
    
    /**
     * Establece el numero de dorsal del jugador.
     * Si el numero está dentro del rango permitido (1 a 30), se establece el valor del atributo "dorsal" con el numero indicado
     * Si el numero no esta dentro del rango permitido, el valor de "dorsal" se establece en -1.
     * @param dorsal El numero de dorsal que se quiere establecer para el jugador.
     */
    
    
    public void ponerDorsal(int dorsal) {

        if(dorsal >= 1 && dorsal <= 30) {
            this.dorsal = dorsal;
        } else {
            this.dorsal = -1;
        }

    }
   

	/**
     * Indica si el jugador está expulsado o no
     * Un jugador esta expulsado si tiene dos tarjertas amarillas o una tajeta roja
     * @return true si el jugador está expulsado, false si no lo está
     * 
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

