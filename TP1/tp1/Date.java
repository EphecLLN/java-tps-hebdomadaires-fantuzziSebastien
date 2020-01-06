/**
 * 
 */
package tp1;

/**
 * @author sebastien
 *
 */
public class Date {

	
	int jour;
	int mois;
	int annee;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date testDate = new Date();
		testDate.jour = 6;
		testDate.mois = 12;
		testDate.annee = 1999;
		System.out.println(testDate.jour);
		System.out.println(testDate.mois);
		System.out.println(testDate.annee);

	}

}
