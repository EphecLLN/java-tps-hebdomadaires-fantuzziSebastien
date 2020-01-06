package tp6;

import java.time.LocalDate;
import java.time.Period;


public class Etudiant extends Personne{

	String matricule;
	
	public Etudiant(String n, String p, String d, String dA) throws DateArriveeInvalideException {
		
		super(n,p,d, dA);
		this.matricule = dA.substring(6, 10) + n.substring(0, 1) + p.substring(0, 1);
		
		int dATemp = Integer.parseInt(dA.substring(6, 10));
		if (dATemp < 2000 || dATemp > LocalDate.now().getYear()) {
			throw new DateArriveeInvalideException("La date d'arrivée n'est pas comprise entre 2000 et " + LocalDate.now().getYear());
		}
	}
	
	public Period anciennete() {
		return Period.between(dateArrivee, LocalDate.now());
	}

	public void affiche() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", prénom=" + prénom + ", anciennete()="
				+ anciennete() + ", age()=" + age() + "]";
	}	
	
	
	public static void main(String[] args) throws DateArriveeInvalideException {
		Etudiant e = new Etudiant(args[0], args[1], args[2], args[3]);
		e.affiche();
	}
}
