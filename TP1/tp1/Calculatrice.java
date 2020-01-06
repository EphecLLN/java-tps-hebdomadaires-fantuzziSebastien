/**
 * 
 */
package tp1;

/**
 * @author sebastien
 *
 */
public class Calculatrice {

	double valeurCourante = 0;
	
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
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculatrice myCalc = new Calculatrice();
		myCalc.ajoute(5);
		System.out.println(myCalc.valeurCourante);
		myCalc.soustrait(2);
		System.out.println(myCalc.valeurCourante);
		
	}

}
