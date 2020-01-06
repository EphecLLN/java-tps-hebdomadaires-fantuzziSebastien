package tp4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		try {
		    BufferedReader reader =
		    		new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\sebastien\\Documents/monfichier.txt")));
		    String line = "";
		    List<Etudiant> etu = new ArrayList<Etudiant>();
		    
		    while((line = reader.readLine()) != null) {
		    	if(line.indexOf(";")!= -1) {
		    		String[] tabEtu = line.split(";");
		    		etu.add(new Etudiant(tabEtu[0], tabEtu[1], Integer.parseInt(tabEtu[2])));
		    		
		        }
		    }
		    System.out.println(etu);
		    reader.close();
		} catch (IOException e) {
		    System.err.println("Erreur lors de la lecture du fichier");
		}


	}

}
