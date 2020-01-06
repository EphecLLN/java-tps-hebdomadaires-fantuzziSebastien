/**
 * 
 */
package tp1;

/**
 * @author sebastien
 *
 */
public class Etudiant {

	
	String nom;
	String prenom;
	int matricule;
	Date dateNaissance;
	
	
	/**
	 * Version 1
	 * @param args
	 */
	/*public static void main(String[] args) {
		/*Etudiant etu1 = new Etudiant();
		etu1.prenom = "Sébastien";
		etu1.nom = "Fantuzzi";
		etu1.matricule = 201693;
		System.out.println(etu1.nom);
		System.out.println(etu1.prenom);
		System.out.println(etu1.matricule);

	}*/
	
	/**
	 * Version 2
	 * @param args
	 */
	public static void main(String[] args) {
		Etudiant etu1 = new Etudiant();
		etu1.nom = args[0];
		etu1.prenom= args[1];
		etu1.matricule = Integer.parseInt(args[2]);
		System.out.println(etu1.nom);
		System.out.println(etu1.prenom);
		System.out.println(etu1.matricule);
		etu1.dateNaissance = new Date();
		etu1.dateNaissance.jour = Integer.parseInt(args[3]);
		etu1.dateNaissance.mois = Integer.parseInt(args[4]);
		etu1.dateNaissance.annee = Integer.parseInt(args[5]);
		System.out.println(etu1.dateNaissance.jour);
		System.out.println(etu1.dateNaissance.mois);
		System.out.println(etu1.dateNaissance.annee);
	}

}
