package tp5;

public class test {

	public static void main(String[] args) {
		//cr�e un objet Personne
		Personne pers = new Personne("Jules", "Dupont", 123234);
		//cr�e un objet Employ�
		Personne emp = new Employ�("Jules", "Dupont", 123234, 1500, "EPHEC");
		//cr�e un objet Ind�pendant
		Personne ind = new Ind�pendant("Jules", "Dupont", 123234, "BE0123456789");
		//affiche le toString() de Personne
		System.out.println(pers);
		//affiche le toString() de Employ�;
		System.out.println(emp);
		//affiche le toString() de Ind�pendant
		System.out.println(ind);
	}

}
