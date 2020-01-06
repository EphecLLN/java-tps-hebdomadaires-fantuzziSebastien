/**
 * 
 */
package tp3;

/**
 * @author sebastien
 *
 */
public class Etudiant {

	//------------------------------------variables
	public String nom;
	public String prenom;
	public int matricule;
	public Date dateNaissance;
	public int tableau[] = new int[5];
	
	
	//----------------------------------------------constructeurs
	/**
	 * 
	 */
	public Etudiant() {
		this.nom = "Fantuzz";
		this.prenom = "Sébastien";
		this.matricule = 201693;
		this.dateNaissance = new Date();
		for (int i = 0; i < tableau.length; i++) {
			this.tableau[i] = i;
		}
	}
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param matricule
	 * @param dateNaissance
	 */
	public Etudiant(String nom, String prenom, int matricule, Date dateNaissance, int tab[] ) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.dateNaissance = dateNaissance;
		this.tableau = tab;
	}


	
	//-----------------------------------------------------methode
	public double moyenne() {
		double sum=0;
		for(int v : tableau){
			sum += v;
		}
		double num_values = tableau.length;
		double moyenne = sum/num_values;
		return moyenne;
	}
	
	
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", matricule=" + matricule + ", dateNaissance="
				+ dateNaissance+", " + "resultats=" + tableau[0] +","+ tableau[1]+"," + tableau[2]+"," + tableau[3]+"," + tableau[4] ;
	}
}
