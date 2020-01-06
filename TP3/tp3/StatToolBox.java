package tp3;

public class StatToolBox {
	int [] values; 
	
	/**
	 * Initialise l'objet �� partir d'une s��rie de valeurs
	 * @param val Un tableau contenant les valeurs de travail
	 */
	public StatToolBox(int [] val){
		values = val;
	}
	
	
	/**
	 * Ajoute une valeur au tableau, �� l'indice indiqu��. 
	 * Si une valeur est d��j�� pr��sente dans le tableau, elle est ��cras��e par la nouvelle valeur.
	 * @param v une valeur �� ajouter �� la liste
	 * @param index l'indice auquel la valeur est ins��r��e
	 * @exception ArrayIndexOutOfBoundsException si l'indice est au del�� des limites du tableau
	 */
	public void setValueAtIndex(int v, int index){
		values[index]=v;
	}
	
	
	/**
	 * Renvoie la valeur �� l'indice sp��cifi��.
	 * @param index l'indice de l'��l��ment �� renvoyer
	 * @return la valeur stock��e �� l'indice sp��cifi��
	 * @exception ArrayIndexOutOfBoundsException si l'indice est au del�� des limites du tableau
	 */
	public int getValueAtIndex(int index){
		return values[index];
	}
	
	
	/**
	 * Calcule la moyenne des valeurs contenues l'objet. 
	 * @return la moyenne 
	 */
	public double moyenne(){
		int sum=0;
		for(int v : values){
			sum += v;
		}
		int num_values = values.length;
		int moyenne = sum/num_values;
		return moyenne;
	}
	
}
