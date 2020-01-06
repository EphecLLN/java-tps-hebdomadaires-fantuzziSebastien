package tp5;

public class test {

	public static void main(String[] args) {
		//crée un objet Personne
		Personne pers = new Personne("Jules", "Dupont", 123234);
		//crée un objet Employé
		Personne emp = new Employé("Jules", "Dupont", 123234, 1500, "EPHEC");
		//crée un objet Indépendant
		Personne ind = new Indépendant("Jules", "Dupont", 123234, "BE0123456789");
		//affiche le toString() de Personne
		System.out.println(pers);
		//affiche le toString() de Employé;
		System.out.println(emp);
		//affiche le toString() de Indépendant
		System.out.println(ind);
	}

}
