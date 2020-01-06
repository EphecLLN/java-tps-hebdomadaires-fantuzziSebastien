package tp4;

public class Personne {
	
	private String nom;
	private String prenom;
	
	public Personne() {
		this.setNom("a");
		this.setPrenom("b");
	}
	
	public Personne(String n, String p) {
		this.setNom(n);
		this.setPrenom(p);
	}
	
	
	
	public String getNom( ) {
		return this.nom;
	}
	
	public void setNom(String n) {
		this.nom = n;
	}
	
	public String getPrenom( ) {
		return this.prenom;
	}
	
	public void setPrenom(String p) {
		this.prenom = p;
	}
	
	
	public  String toString() {
		return "nom : " + nom + "   prenom: " + prenom;
	}
	
	
	
	public int compareTo(Personne e) {
		Personne pers = new Personne();
		if (pers.nom.compareTo(e.nom) < 0)
			return -1;
		if (pers.nom.compareTo(e.nom) > 0)
			return 1;
		if (pers.prenom.compareTo(e.prenom) < 0)
			return -1;
		if (pers.prenom.compareTo(e.prenom) > 0)
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
		Personne other = (Personne) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Personne pers = new Personne();
		System.out.println(pers.compareTo(new Personne("a", "c")));
	}
	
	
}
