package tp2;

/**
 * Cette classe modélise une calculatrice simplifiée avec une valeur courante et trois opérations. 
 * @author vvandens
 *
 */
public class Calculatrice {

	//variables
	private double valeurCourante; // Stocke la valeur affichée sur l'�cran de la calculatrice


//----------------------------------------------

	//setters et getters
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

//---------------------------------------------



	//constructeur
	/**
	 * 
	 */
	public Calculatrice() {
		//super(); //appelle le constructeur de hi�rarchie sup�rieur; pas tjs indispensable
		valeurCourante = 10;
	}


	/**
	 * @param valeurCourante
	 */
	public Calculatrice(double valeurCourante) {
		super();
		this.valeurCourante = valeurCourante;
	}


//---------------------------------------------------------
	
	
	//m�thodes
	/**
	 * Additionne un nombre à la valeur courante
	 * @param n le nombre à ajouter à la valeur courante de la calculatrice
	 */
	public void ajoute(double n) {
		valeurCourante+=n;
	}



	/**
	 * Soustrait un nombre à la valeur courante
	 * @param n le nombre à soustraire à la valeur courante de la calculatrice
	 */
	public void soustrait(double n) {
		valeurCourante-=n;
	}



	/**
	 * Elève la valeur courante au carré
	 */
	public void carre() {
		valeurCourante*=valeurCourante;
	}


	

	/**
	 * Renvoie une representation textuelle de la valeur affich�e sur la calculatrice
	 */
	@Override
	public String toString() {
		return "La calculatrice affiche la valeur " + getValeurCourante();
	}

	
	
	

	/**
	 * Méthode main permettant de lancer un test rapide de la classe calculatrice.
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice myCalc = new Calculatrice();
		System.out.println(myCalc);
		myCalc.ajoute(5);
		myCalc.soustrait(2);
		System.out.println(myCalc.valeurCourante);
	}

}
