/**
 * 
 */
package tp5;

/**
 * @author sebastien
 *
 */
public class Indépendant extends Personne {

	String TVA;
	
	public Indépendant(String n, String p, int num, String tva) {
		super(n,p,num);
		this.TVA = tva;
	}

	/**
	 * @param object  L'objet dont on veut savoir si il est égal à un objet Indépendant
	 * 
	 * @return boolean  Renvoie true si les 2 objets comparés sont égaux, sinon renvoie false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Indépendant other = (Indépendant) obj;
		if (TVA == null) {
			if (other.TVA != null)
				return false;
		} else if (!TVA.equals(other.TVA))
			return false;
		return true;
	}

	/**
	 * @return String  Renvoie sous forme de string la tva, le nom, prenom et le numero de registre national
	 */
	@Override
	public String toString() {
		return "Indépendant [TVA=" + TVA + ", nom=" + nom + ", prenom=" + prenom + ", numRegistreNational="
				+ numRegistreNational + "]";
	}	
}
