package tp6;

public abstract class Shape implements Affichable, Transformable{

	static int identifiant;
	int absisse;
	int ordonn�e;
	
	public Shape(int x, int y) {
		this.absisse = x;
		this.ordonn�e = y;
	}
	
	public abstract double surface();
	
	public abstract double perimetre();
	
	public String getNom() {
		return getClass().getSimpleName() + "-" + identifiant;
	}

	
	@Override
	public String toString() {
		return "getClass().getSimpleName() \n" + absisse + "x" + ordonn�e + "(y) \n" + this.perimetre() + "\n" + this.surface();
	}
	
	
}
