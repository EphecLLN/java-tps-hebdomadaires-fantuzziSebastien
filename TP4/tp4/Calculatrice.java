/**
 * 
 */
package tp4;

/**
 * @author sebastien
 *
 */
public class Calculatrice {

	private double valeurCourante;
	
	
	public Calculatrice() {
		this.setValeurCourante(0);
	}
	
	public Calculatrice(double x) {
		this.setValeurCourante(x);
	}
	
	
	
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


	//---------------------------------------methodes
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
		return "Calculatrice [valeurCourante=" + valeurCourante + "]";
	}


	public int compareTo(Calculatrice e) {
		Calculatrice calc = new Calculatrice();
		if (calc.valeurCourante < e.valeurCourante)
			return -1;
		if (calc.valeurCourante > e.valeurCourante)
			return 1;
		return 0;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculatrice other = (Calculatrice) obj;
		if (Double.doubleToLongBits(valeurCourante) != Double.doubleToLongBits(other.valeurCourante))
			return false;
		return true;
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
