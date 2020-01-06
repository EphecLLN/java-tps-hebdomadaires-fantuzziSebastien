package tp6;

import java.time.LocalDate;
import java.time.Period;

public class Professeur extends Personne{

	
	
	public Professeur(String n, String p, String d, String dA) {
		super(n,p,d, dA);
		
	}
	
	
	public Period anciennete() {
		
		Period ageAArrivee = Period.between(dateDeNaissance, dateArrivee);
		int x = 0;
		if(ageAArrivee.getYears() >= 23) {
			return Period.between(dateArrivee, LocalDate.now());
		}
		else {
			while(ageAArrivee.getYears() >= 23) {
				ageAArrivee.plusYears(1);
				x++;
			}
			return Period.between(dateArrivee, LocalDate.now()).minusYears(x);
		}
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}
}
