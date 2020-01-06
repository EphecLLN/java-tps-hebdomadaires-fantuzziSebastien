package tp6;

public abstract class Shape implements Affichable, Transformable{

	static int identifiant;
	int absisse;
	int ordonnée;
	
	public Shape(int x, int y) {
		this.absisse = x;
		this.ordonnée = y;
	}
	
	public abstract double surface();
	
	public abstract double perimetre();
	
	public String getNom() {
		return getClass().getSimpleName() + "-" + identifiant;
	}

	
	@Override
	public String toString() {
		return "getClass().getSimpleName() \n" + absisse + "x" + ordonnée + "(y) \n" + this.perimetre() + "\n" + this.surface();
	}
	
	
}
