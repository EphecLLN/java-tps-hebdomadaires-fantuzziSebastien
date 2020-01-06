/**
 * 
 */
package tp2;

/**
 * @author sebastien
 *
 */
public class Etudiant {

	//------------------------------------variables
	private String nom;
	private String prenom;
	private int matricule;
	private Date dateNaissance;
	
	
	//----------------------------------------------constructeurs
	/**
	 * 
	 */
	public Etudiant() {
		this.setNom("Fantuzz");
		this.setPrenom("Sébastien");
		this.setMatricule(201693);
		this.setDateNaissance(new Date());
	}
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param matricule
	 * @param dateNaissance
	 */
	public Etudiant(String nom, String prenom, int matricule, Date dateNaissance) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setMatricule(matricule);
		this.setDateNaissance(dateNaissance);
	}

	
	//---------------------------------------------------------setters/getters
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * @return the matricule
	 */
	public int getMatricule() {
		return matricule;
	}


	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}


	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}


	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	
	//-----------------------------------------------------methode
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", matricule=" + matricule + ", dateNaissance="
				+ dateNaissance + "]";
	}

	
	//------------------------------------------------------main
	/**
	 * Version 1
	 * @param args
	 */
	/*public static void main(String[] args) {
		Etudiant etu1 = new Etudiant();
		System.out.println(etu1.nom);
		System.out.println(etu1.prenom);
		System.out.println(etu1.matricule);
		System.out.println(etu1.dateNaissance.getJour());
		System.out.println(etu1.dateNaissance.getMois());
		System.out.println(etu1.dateNaissance.getAnnee());
		System.out.println(etu1);

	}*/



	/**
	 * Version 2
	 * @param args
	 */
	public static void main(String[] args) {
		Etudiant etu1 = new Etudiant("Fantuzzi", "Sebastien", 201693, new Date(6, 12, 1999));
		/*System.out.println(etu1.nom);
		System.out.println(etu1.prenom);
		System.out.println(etu1.matricule);
		System.out.println(etu1.dateNaissance.getJour());
		System.out.println(etu1.dateNaissance.getMois());
		System.out.println(etu1.dateNaissance.getAnnee());*/
		System.out.println(etu1);
	}

}
