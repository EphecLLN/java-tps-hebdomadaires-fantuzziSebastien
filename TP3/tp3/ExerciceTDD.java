/**
 * 
 */
package tp3;

/**
 * @author sebastien
 *
 */
public class ExerciceTDD {
	
	
	public  boolean estPair(double x) {
		if (x%2==0) {
			return true;
		}
		return false;
	}
	
	public double perimetreCarre(double x) {
		return 4*x;
	}
	
	public boolean contientCaractere(String x) {
		if ("sdrhsgfhjdfy".contains(x))
			return true;
		return false;
	}
}
