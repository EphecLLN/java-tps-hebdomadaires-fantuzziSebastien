/**
 * 
 */
package tp5_bibliotheque;

import java.util.Arrays;

/**
 * @author sebastien
 *
 */
public class Livre {

	String auteur;
	String titre;
	String anEdition;
	String[] page = new String[100];
	
	
	public Livre(String a, String t, String edit) {
		this.setAuteur(a);
		this.setTitre(t);
		this.setAnEdition(edit);
	}
	
	public Livre(String a, String t, String edit, String[] liv) {
		this.setAuteur(a);
		this.setTitre(t);
		this.setAnEdition(edit);
		this.setPage(liv);
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
		if (auteur == "") { this.auteur = "Auteur inconnu";}
		this.auteur = auteur;
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
		if (titre == "") {this.titre = "Titre inconnu";}
		this.titre = titre;
	}
	/**
	 * @return the anEdition
	 */
	public String getAnEdition() {
		return anEdition;
	}
	/**
	 * @param anEdition the anEdition to set
	 */
	public void setAnEdition(String anEdition) {
		this.anEdition = anEdition;
	}
	/**
	 * @return the page
	 */
	public String[] getPage() {
		return page;
	}
	
	public String getPage(int i) {
		if (page[i] == null) {
			return null;
		}
		else return page[i];
	}
	
	/**
	 * @param page the page to set
	 */
	public void setPage(String[] page) {
		this.page = page;
	}
	
	/**
	 * 
	 * @param i : int   indice
	 * @param p : String  La nouvelle page
	 * @return String un msg d'erreur ou la valeur precedente de la page qui est remplacée
	 */
	public String setPage(int i, String p) {
		if (page[i] == null ) {
			return "mauvais indice";
		}
		else {
			String temp = page[i];
			page[i] = p;
			return temp;
		}
	}
	
	
	public String getFirstPage() {
		return this.getPage(0);
	}
	
	public String extrait() {
		return this.getFirstPage();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anEdition == null) ? 0 : anEdition.hashCode());
		result = prime * result + ((auteur == null) ? 0 : auteur.hashCode());
		result = prime * result + Arrays.hashCode(page);
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		return result;
	}
	
	/**
	 * @param object  L'objet dont on veut savoir si il est égal à un objet Livre
	 * 
	 * @return boolean  Renvoie true si les 2 objets comparés sont égaux, sinon renvoie false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		if (anEdition == null) {
			if (other.anEdition != null)
				return false;
		} else if (!anEdition.equals(other.anEdition))
			return false;
		if (auteur == null) {
			if (other.auteur != null)
				return false;
		} else if (!auteur.equals(other.auteur))
			return false;
		if (!Arrays.equals(page, other.page))
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Livre [auteur=" + auteur + ", titre=" + titre + ", anEdition=" + anEdition + "]";
	}
	
	
	
}
