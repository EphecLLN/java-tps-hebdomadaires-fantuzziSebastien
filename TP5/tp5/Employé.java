/**
 * 
 */
package tp5;

/**
 * @author sebastien
 *
 */
public class Employ� extends Personne{

	int salaire;
	String employeur;
	
	/**
	 * 
	 * @param n : String  Le nom de l'employ�
	 * @param p : String  Le prenom de l'employ�
	 * @param num : int   Le numero de registre national de l'employ�
	 * @param sal : int   Le salaire de l'employ�
	 * @param emp : String  Le nom de l'employeur
	 */
	public Employ�(String n, String p, int num, int sal, String emp) {
		super(n,p,num);
		this.salaire = sal;
		this.employeur = emp;
	}

	/**
	 * @param object  L'objet dont on veut savoir si il est �gal � un objet Employ�
	 * 
	 * @return boolean  Renvoie true si les 2 objets compar�s sont �gaux, sinon renvoie false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employ� other = (Employ�) obj;
		if (employeur == null) {
			if (other.employeur != null)
				return false;
		} else if (!employeur.equals(other.employeur))
			return false;
		if (salaire != other.salaire)
			return false;
		return true;
	}

	/**
	 * @return String  Renvoie sous forme de string le salaire, le nom de l'employeur, le nom, prenom et le numero de registre national
	 */
	@Override
	public String toString() {
		return "Employ� [salaire=" + salaire + ", employeur=" + employeur + ", nom=" + nom + ", prenom=" + prenom
				+ ", numRegistreNational=" + numRegistreNational + "]";
	}	
}
