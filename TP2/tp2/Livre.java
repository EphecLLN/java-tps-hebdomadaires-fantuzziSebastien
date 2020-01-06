/**
 * 
 */
package tp2;

/**
 * @author sebastien
 *
 */
public class Livre {
	
	//-----------------------------------------variables
	String titre;
	String auteur;
	String numISBN;
	
	
	
	//----------------------------------------------constructeurs
	/**
	 * 
	 */
	public Livre() {
		this.setAuteur("Cherub");
		this.setTitre("Hors-la-loi");
		this.setNumISBN("1323456");
	}


	/**
	 * @param titre
	 * @param auteur
	 * @param numISBN
	 */
	public Livre(String titre, String auteur, String numISBN) {
		this.setTitre(titre);
		this.setAuteur(auteur);
		this.setNumISBN(numISBN);
	}



	//----------------------------------------------setters/getters
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}


	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}


	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}


	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	/**
	 * @return the numISBN
	 */
	public String getNumISBN() {
		return numISBN;
	}


	/**
	 * @param numISBN the numISBN to set
	 */
	public void setNumISBN(String numISBN) {
		this.numISBN = numISBN;
	}


	//----------------------------------------------------methode
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", numISBN=" + numISBN + "]";
	}


	//-------------------------------------------------main
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Livre livre1 = new Livre();
		System.out.println(livre1);
		
	}

}
