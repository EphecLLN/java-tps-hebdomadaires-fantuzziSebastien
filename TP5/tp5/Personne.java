/**
 * 
 */
package tp5;

/**
 * @author sebastien
 *
 */
public class Personne {

	String nom;
	String prenom;
	int numRegistreNational;
	
	/**
	 * 
	 * @param n : String  Le nom de la personne
	 * @param p : String  Le prenom de la personne
	 * @param num : int   Le numero de registre national de la personne
	 */
	public Personne(String n, String p, int num) {
		this.nom = n;
		this.prenom = p;
		this.numRegistreNational = num;
	}

	/**
	 * @param object  L'objet dont on veut savoir si il est égal à un objet Personne
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
		Personne other = (Personne) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numRegistreNational != other.numRegistreNational)
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}


	/**
	 * @return String  Renvoie sous forme de string le nom, prenom; et le numero de registre national
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", numRegistreNational=" + numRegistreNational + "]";
	}
	
	
	
	
}
