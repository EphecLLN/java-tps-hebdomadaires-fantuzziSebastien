/**
 * 
 */
package tp4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * @author sebastien
 *
 */
public class Etudiant {

	
	private String nom;
	private String prenom;
	private int matricule;
	private LocalDate dateNaissance;
	private static int nbEtudiants = 0;
	
	/*DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	   LocalDate auj = LocalDate.now();
	   System.out.println("Nous sommes : "+format.format(auj));
	   LocalDate jourDeLAn2016 = LocalDate.of(2016, Month.JANUARY, 1);
	   System.out.println("Jour de l'an : "+format.format(jourDeLAn2016));*/
	
	public Etudiant() {
		this.setNom("fan");
		this.setPrenom("seb");
		this.matricule = nbEtudiants;
		nbEtudiants++;
		this.setDateNaissance(LocalDateTime.now().toLocalDate());
	}
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param matricule
	 * @param dateNaissance
	 */
	public Etudiant(String nom, String prenom, LocalDate dateNaissance) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.matricule = nbEtudiants;
		nbEtudiants++;
		this.setDateNaissance(dateNaissance);
	}

	//necessaire pour le dernier ex (cf class Test)
	public Etudiant(String nom, String prenom, int matricule) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.matricule = matricule;
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
	 * @return the nbEtudiants
	 */
	public int getNbEtudiants() {
		return nbEtudiants;
	}


	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}


	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	
	public Period age() {
		LocalDate date1 = LocalDateTime.now().toLocalDate();	
		Period sonAge = Period.between(dateNaissance, date1);
		return sonAge;
	}
	
	

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", matricule=" + matricule + ", dateNaissance=" + dateNaissance + "]";
	}


	public int compareTo(Etudiant e) {
		Etudiant etu = new Etudiant();
		if (etu.matricule < e.matricule)
			return -1;
		if (etu.matricule > e.matricule)
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
		Etudiant other = (Etudiant) obj;
		if (matricule != other.matricule)
			return false;
		return true;
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Etudiant etu1 = new Etudiant();
		//System.out.println(etu1.getNbEtudiants());
		/*etu1.nom = args[0];
		etu1.prenom= args[1];
		etu1.matricule = Integer.parseInt(args[2]);
		System.out.println(etu1.nom);
		System.out.println(etu1.prenom);
		System.out.println(etu1.matricule);
		etu1.dateNaissance = new Date();
		etu1.dateNaissance.setJour(Integer.parseInt(args[3]));
		//etu1.dateNaissance.mois = Integer.parseInt(args[4]);
		//etu1.dateNaissance.annee = Integer.parseInt(args[5]);
		//System.out.println(etu1.dateNaissance.jour);
		//System.out.println(etu1.dateNaissance.mois);
		//System.out.println(etu1.dateNaissance.annee);*/
		//System.out.println(new Date());
		/*int a = new Date().getDate(); //jour
		int b = new Date().getMonth();
		int c = new Date().getYear();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		Date dat = new Date(1999, 11, 6);
		System.out.println(Period.between(dat, LocalDate());
		LocalDateTime currentTime = LocalDateTime.now();*/
		
		//LocalDateTime currentTime = LocalDateTime.now();
		//System.out.println(currentTime);
		LocalDate date1 = LocalDateTime.now().toLocalDate();
		System.out.println(date1);
		
		LocalDateTime date2 = LocalDateTime.now().withDayOfMonth(6).withYear(1999).withMonth(10);
		System.out.println(date2);
		LocalDate date3 = date2.toLocalDate();
		System.out.println(Period.between(date3, date1));
		
	}




}
