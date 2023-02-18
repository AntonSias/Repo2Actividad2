package Requirimiento1;
 /**
  * @autor Minerva
  * version 1.0.
  */

 /**
 * Creamos la clase soldado con los atributos
 */
 public class Soldado {

	private boolean estaMuerto;
    private int numeroBalas;

    //Creamos los getter and setter//

    public int getNumeroBalas() {
        return numeroBalas;
    }

	public void setNumeroBalas(int numeroBalas) {
        this.numeroBalas = numeroBalas;
    }
  
    
    /**
     * Verifica si el soldado puede disparar.
     *
     * @return true si el soldado tiene balas disponibles, false de lo contrario.
     */
    public boolean puedeDisparar() {
        return this.numeroBalas > 0;
    }

    /**
     * Hace que el soldado dispare a otro soldado.
     *
     * @param sol el soldado al que se le dispara.
     */
    public void disparar(Soldado sol) {
        this.numeroBalas--;
        
    }

    /**
     * Establece el estado del soldado.
     *
     * @param estaMuerto true si el soldado está muerto, false de lo contrario.
     */
   
    }
