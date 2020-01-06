/**
 * 
 */
package tp1;

/**
 * @author sebastien
 *
 */
public class Livre {
	
	String titre;
	String auteur;
	String numISBN;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Livre livre1 = new Livre();
		livre1.auteur = "Cherub";
		livre1.titre = "Hors-la-loi";
		livre1.numISBN = "1323456";
		System.out.println(livre1.auteur);
		System.out.println(livre1.titre);
		System.out.println(livre1.numISBN);
		
	}

}
