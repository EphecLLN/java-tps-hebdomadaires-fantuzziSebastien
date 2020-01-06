package tp6;

public class Cercle extends Shape {

	int rayon;
	
	//x,y = le centre
	public Cercle(int x, int y, int r) {
		super(x, y);
		this.rayon = r;
		identifiant++;
	}
	
	public double surface() {
		return Math.PI*(rayon*rayon);
	}
	
	public double perimetre() {
		return 2*Math.PI*rayon;
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}

	public void deplace(int deltaX, int deltaY) {
		this.absisse = deltaX;
		this.ordonnée = deltaY;
	}
	
	public void agrandit(int facteur) {
		this.rayon*=(double)facteur;
	}
	
	public static void main(String[] args) {
		Cercle c = new Cercle(1,1, 4);
		System.out.println(c.surface());
		System.out.println(c.perimetre());
	}	
}
