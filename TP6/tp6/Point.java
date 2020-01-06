package tp6;

public class Point extends Shape {


	public Point(int x, int y) {
		super(x, y);
		identifiant++;
	}
	
	public double surface() {
		return (Double) null;
	}
	
	public double perimetre() {
		return (Double) null;
	}	
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
	public void deplace(int deltaX, int deltaY) {
		this.absisse = deltaX;
		this.ordonnée = deltaY;
	}
	
	public void agrandit(int facteur) {}
}
