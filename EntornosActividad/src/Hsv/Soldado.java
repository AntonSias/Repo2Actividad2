package Hsv;

/** 
 *--- CREAMOS LA CALSE SOLDADO---
 * 
 * @author SILVIAN
 *
 *@version 18/02/23
 */
  public class Soldado {

	/**
	 * ---CREAMOS LOS ATRIBUTOS DE LA CLASE SOLDADO---
	 */
       private boolean estaMuerto;
       private int numeroBalas;

  /***-------- GETTER AND SETTER ---------***/
       
       
       public boolean isEstaMuerto() {
       	return estaMuerto;
       }


       public void setEstaMuerto(boolean estaMuerto) {
       	this.estaMuerto = estaMuerto;
       }


       public int getNumeroBalas() {
       	return numeroBalas;
       }


       public void setNumeroBalas(int numeroBalas) {
       	this.numeroBalas = numeroBalas;
       }
  
       
/**
 * ---CREAMOS LOS METODOS DE LOS ATRIBUTOS ---
 * 
 */
     
       
  /**
   * --- METODO puedeDisparar ---
   * 
   *  Este metodo significa que  el soldado recibe un numero de balas y no da los siguente posibilidades :
   *  
   *  1. Si el soldado recibe un numero de balas > 0 entonces  resultado sera :
   *                           ->    @return TRUE
   * 
   *  2. Si  el soldado recibe un numero de balas < 0 entonces el resultado sera :
   *                            ->  @return FLASE 
   */
     
       public boolean puedeDisparar() {

         if(this.numeroBalas > 0) {

          return true;
          }                          

           return false;
           }
       

/**
 * --- METODO disparar---
 * 
 *  Este metodo significa que todos los numeros de balas estan restados  y el soldado resulta muerto "true"
 * 
 * @param sol -> es un  objeto creado por el metodo
 */
       
      public void disparar(Soldado sol) {

           this.numeroBalas--;

           sol.estaMuerto = true;

}

}
       
       
       
       
       
        



	


