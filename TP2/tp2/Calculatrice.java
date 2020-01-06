/**
 * 
 */
package tp2;

/**
 * @author sebastien
 *
 */
public class Calculatrice {

	//---------------------------------------------variable
	private double valeurCourante;
	
	
	//------------------------------------------------constructeurs
	/**
	 * @param valeurCourante
	 */
	public Calculatrice(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}
	
	
	/**
	 * @param valeurCourante
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
	 * @param n
	 */
	public void ajoute(double n) {
		this.valeurCourante += n;
	}
	
	
	/**
	 * @param n
	 */
	public void soustrait(double n) {
		valeurCourante -= n;
	}
	
	
	
	@Override
	public String toString() {
		return "Calculatrice [valeurCourante= " + valeurCourante + "]";
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
