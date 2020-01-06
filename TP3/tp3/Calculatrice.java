/**
 * 
 */
package tp3;

/**
 * @author sebastien
 *
 */
public class Calculatrice {

	//---------------------------------------------variable
	private double valeurCourante;
	
	
	//------------------------------------------------constructeurs
	/**
	 * @param double
	 */
	public Calculatrice(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}
	
	
	/**
	 * 
	 */
	public Calculatrice() {
		this.valeurCourante = 0;
	}

	
	
	//----------------------------------------------------setters/getters
	/**
	 * @return the valeurCourante
	 */
	public double getValeurCourante() {
		return valeurCourante;
	}


	/**
	 * @param valeurCourante the valeurCourante to set
	 */
	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}


	//--------------------------------------------------methode
	/**
	 * @param double
	 */
	public void ajoute(double n) {
		this.valeurCourante += n;
	}
	
	
	/**
	 * @param double
	 */
	public void soustrait(double n) {
		valeurCourante -= n;
	}
	
	
	
	@Override
	public String toString() {
		return "Calculatrice [valeurCourante= " + valeurCourante + "]";
	}
	
	/**
	* Cette méthode calcule le carré d’un nombre.
	* @param x : Un nombre entier quelconque
	* @return Un nombre >= 0, résultat de la multiplication de x par lui-même
	*/
	public double auCarre(double x) {
		return x*x;
	}


	//--------------------------------------------------main
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculatrice myCalc = new Calculatrice();
		myCalc.ajoute(5);
		System.out.println(myCalc);
		
	}

}
