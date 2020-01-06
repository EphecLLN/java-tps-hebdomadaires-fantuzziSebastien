/**
 * 
 */
package tp5;

/**
 * @author sebastien
 *
 */
public class Employé extends Personne{

	int salaire;
	String employeur;
	
	/**
	 * 
	 * @param n : String  Le nom de l'employé
	 * @param p : String  Le prenom de l'employé
	 * @param num : int   Le numero de registre national de l'employé
	 * @param sal : int   Le salaire de l'employé
	 * @param emp : String  Le nom de l'employeur
	 */
	public Employé(String n, String p, int num, int sal, String emp) {
		super(n,p,num);
		this.salaire = sal;
		this.employeur = emp;
	}

	/**
	 * @param object  L'objet dont on veut savoir si il est égal à un objet Employé
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
		Employé other = (Employé) obj;
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
		return "Employé [salaire=" + salaire + ", employeur=" + employeur + ", nom=" + nom + ", prenom=" + prenom
				+ ", numRegistreNational=" + numRegistreNational + "]";
	}	
}
