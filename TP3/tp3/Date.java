/**
 * 
 */
package tp3;

/**
 * @author sebastien
 *
 */
public class Date {

	//-------------------------------------------------variables
	private int jour;
	private int mois;
	private int annee;
	
	
	//---------------------------------------------------constructeurs
	/**
	 * @param jour
	 * @param mois
	 * @param annee
	 */
	public Date(int jour, int mois, int annee) {
		this.setJour(jour);
		this.setMois(mois);
		this.setAnnee(annee);
	}
	
	
	/**
	 * 
	 */
	public Date() {
		this.setJour(6);
		this.setMois(12);
		this.setAnnee(1999);
	}


	//-----------------------------------------------------------setters/getters
	/**
	 * @return the jour
	 */
	public int getJour() {
		return jour;
	}


	/**
	 * @param jour the jour to set
	 */
	public void setJour(int jour) {
		if (jour < 32 && jour > 0) {
			this.jour = jour;
		}
	}


	/**
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}


	/**
	 * @param mois the mois to set
	 */
	public void setMois(int mois) {
		if(mois > 0 && mois < 13) {
			this.mois = mois;
		}
	}


	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}


	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		if(annee >1850 && annee < 2020 ) {
			this.annee = annee;
		}
	}

	

	//----------------------------------------------------methode
	@Override
	public String toString() {
		return "Date [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
	}

}
