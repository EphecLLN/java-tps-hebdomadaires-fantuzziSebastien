package tp1;

public class Personne {
	
	private String nom;
	private String prenom;
	
	public Personne() {
		this.setNom("fantuzzi");
		this.setPrenom("sebastien");
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
}
