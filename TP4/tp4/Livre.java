/**
 * 
 */
package tp4;

/**
 * @author sebastien
 *
 */
public class Livre {
	
	private String titre;
	private String auteur;
	private String numISBN;
	

	/**
	 * 
	 */
	public Livre() {
		this.setTitre("ilug");
		this.setAuteur("srdys");
		this.setNumISBN("srdt");
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

	
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", numISBN=" + numISBN + "]";
	}


	public int compareTo(Livre e) {
		Livre book = new Livre();
		if (book.numISBN.compareTo(e.numISBN) < 0)
			return -1;
		if (book.numISBN.compareTo(e.numISBN) > 0)
			return 1;
		return 0;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		if (auteur == null) {
			if (other.auteur != null)
				return false;
		} else if (!auteur.equals(other.auteur))
			return false;
		if (numISBN == null) {
			if (other.numISBN != null)
				return false;
		} else if (!numISBN.equals(other.numISBN))
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}


	
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
