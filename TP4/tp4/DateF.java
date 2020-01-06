/**
 * 
 */
package tp4;

import java.text.SimpleDateFormat;

/**
 * @author sebastien
 *
 */
public class DateF {

	
	private int jour;
	private int mois;
	private int annee;
	private String dateString;
	
	/*DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	   LocalDate auj = LocalDate.now();
	   System.out.println("Nous sommes : "+format.format(auj));
	   LocalDate jourDeLAn2016 = LocalDate.of(2016, Month.JANUARY, 1);
	   System.out.println("Jour de l'an : "+format.format(jourDeLAn2016));*/
	
	public DateF() {
		this.setJour(2);
		this.setMois(10);
		this.setAnnee(2020);
	}
	
	public DateF(int j, int m, int a) {
		this.setJour(j);
		this.setMois(m);
		this.setAnnee(a);
	}
	
	/*public Date(String a) {
		Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(a);
	}*/
	
	public DateF(String str) {
		this.setDateString(str);
	}
	

	/**
	 * @return the dateString
	 */
	public String getDateString() {
		return dateString;
	}

	/**
	 * @param dateString the dateString to set
	 */
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

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
		if (jour <= 31 && jour > 0)
			this.jour = jour;
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
		if (mois <= 12 && mois > 0)
			this.mois = mois;
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
		if (annee > 0)
			this.annee = annee;
	}


	
	@Override
	public String toString() {
		return "Date [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
	}

	
	
	public int compareTo(DateF e) {
		DateF date1 = new DateF();
		if (date1.jour < e.jour && date1.mois < e.mois && date1.annee < e.annee)
			return -1;
		if (date1.jour > e.jour && date1.mois > e.mois && date1.annee > e.annee)
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
		DateF other = (DateF) obj;
		if (annee != other.annee)
			return false;
		if (jour != other.jour)
			return false;
		if (mois != other.mois)
			return false;
		return true;
	}





	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateF testDate = new DateF();
		testDate.jour = 6;
		testDate.mois = 12;
		testDate.annee = 1999;
		System.out.println(testDate.jour);
		System.out.println(testDate.mois);
		System.out.println(testDate.annee);

	}

}
