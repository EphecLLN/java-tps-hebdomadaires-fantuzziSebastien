package tp4;

public class Cercle {

	private Double rayon;
	
	
	/**
	 * @param rayon
	 */
	public Cercle(Double rayon) {
		this.rayon = rayon;
	}
	
	public Cercle() {
		this.rayon = 5.0;
	}

	public double aire() {
		return rayon * rayon * Math.PI;
	}
	
	public double perimetre() {
		return 2*rayon*Math.PI;
	}
	
	
	public int compareTo(Cercle e) {
		Cercle c1 = new Cercle();
		if(c1.rayon < e.rayon) return -1;
		if(c1.rayon > e.rayon) return 1;
		return 0;
	}
}
