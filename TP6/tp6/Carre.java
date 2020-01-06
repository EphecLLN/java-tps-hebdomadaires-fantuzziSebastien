package tp6;

public class Carre extends Shape {

	double longeur;
	
	
	/**
	 * @param x
	 * @param y
	 * @param longeur
	 */
	public Carre(int x, int y, double longeur) { //x,y = coin inferieur gauche
		super(x, y);
		this.longeur = longeur;
		identifiant++;
	}

	public double surface() {
		return longeur*longeur;
	}
	
	public double perimetre() {
		return longeur*4;
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
	public void deplace(int deltaX, int deltaY) {
		this.absisse = deltaX;
		this.ordonnée = deltaY;
	}
	
	public void agrandit(int facteur) {
		this.longeur*=(double)facteur;
	}
	
	public static void main(String[] args) {
		Carre c = new Carre(1,1, 2);
		System.out.println(c.surface());
		System.out.println(c.perimetre());
	}
}
