package parte1;
/**
 * Definimos la clase Soldado el 18/02/2023
 * Esta clase define objetos que tienen la habilidad de disparar 
 * 
 * @author Antón
 * @version 1.0
 */
public class Soldado {
	//ATRIBUTOS
	private boolean estaMuerto;
	
    private int numeroBalas;
    
	public boolean isEstaMuerto() {
		return estaMuerto;
	}
	
	//GETTERS & SETTERS
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	//METODOS 
    /**
     * Este método nos inidica si el objeto puede disparar, dependiendo del número de balas que tenga,
     * o no devolviéndonos un boolan.
     * @return true si el número de balas del objeto es superior a 0 y false si el numero de balas 
     * es igual o menor que 0
     */
	public boolean puedeDisparar() {

           if(this.numeroBalas > 0) {

             return true;

           }                          

           return false;

	 }


	/**
	 * Este método cambia el estado del objeto Soldado que le pasamos como parámetro
	 * restándole en 1 el número de balas y cambiando su estado boolean de estaMuerta a true.
	 * @param sol El parámetro sol es un objeto de tipo Soldado 
	 */
	public void disparar(Soldado sol) {
	
	           this.numeroBalas--;
	
	           sol.estaMuerto = true;
	
	}
	
}
