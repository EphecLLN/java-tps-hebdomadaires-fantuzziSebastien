package tp6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Personne implements Affichable {
	
	String nom;
	String prénom;
	LocalDate dateDeNaissance;
	LocalDate dateArrivee;
	
	public Personne(String n, String p, String d, String dA) {
		this.nom = n;
		this.prénom = p;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.FRENCH );
		LocalDate date = LocalDate.parse(d, formatter);
		this.dateDeNaissance = date;
		
		LocalDate date2 = LocalDate.parse(dA, formatter);
		this.dateArrivee = date2;
	}
	
	
	public Period age() {
		LocalDate date1 = LocalDateTime.now().toLocalDate();
		Period sonAge = Period.between(dateDeNaissance, date1);
		return sonAge;
	}
	
	public abstract Period anciennete();


	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prénom=" + prénom + ", dateDeNaissance=" + dateDeNaissance + ", age()="
				+ age() + ", ancienneté()=" + anciennete() + "]";
	}
	
	
}