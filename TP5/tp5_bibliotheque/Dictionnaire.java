package tp5_bibliotheque;

import java.util.Arrays;

public class Dictionnaire extends Livre{
	
	String[][] dictPages = new String[100][10];

	/**
	 * @param a
	 * @param t
	 * @param edit
	 * @param liv
	 */
	public Dictionnaire(String a, String t, String edit, String[][] dic) {
		super(a, t, edit);
		this.dictPages = dic;
	}

	/**
	 * @param a
	 * @param t
	 * @param edit
	 */
	public Dictionnaire(String a, String t, String edit) {
		super(a, t, edit);
	}

	
	public String getPage(int i) {
		if (dictPages[i] == null) {
			return null;
		}
		else {
			String pagDiffdef = "";
			for (int j = 0; j < dictPages[0].length ; j++) {
				pagDiffdef += dictPages[i][j] + "\n";
			}
			return pagDiffdef;
		}
	}
	
	
	public String setPage(int i, String p) {
		String temp = "";
		if (dictPages[i] == null ) {
			return "mauvais indice";
		}
		else {
			String[] ligne = p.split("\n)");
			for (int j = 0; j < dictPages[0].length ; j++) {
				temp = dictPages[i][j] + "\n";
				dictPages[i][j] = ligne[j];
			}
			return temp;
		}
	}
	
	
	public String getFirstPage() {
		return this.getPage(0);
	}
	
	public String extrait() {
		return dictPages[0][0];
	}
	
	
	public String getDefinition(int i, int j) {
		return dictPages[i][j];
	}
	
	public void setDefinition(int i, int j, String def) {
		this.dictPages[i][j] = def;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.deepHashCode(dictPages);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dictionnaire other = (Dictionnaire) obj;
		if (!Arrays.deepEquals(dictPages, other.dictPages))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dictionnaire [dictPages=" + Arrays.toString(dictPages) + ", auteur=" + auteur + ", titre=" + titre
				+ ", anEdition=" + anEdition + ", page=" + Arrays.toString(page) + "]";
	}	
}
