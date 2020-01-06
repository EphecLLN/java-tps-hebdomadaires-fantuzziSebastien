/**
 * 
 */
package tp2;


/**
 * @author sebastien
 *
 */
public class IP {
	
	//------------------------------------------variables
	private int octet1;
	private int octet2;
	private int octet3;
	private int octet4;

	
	//----------------------------------------------constructeurs
	/**
	 * 
	 */
	public IP() {
		this.setOctet1(124);
		this.setOctet2(0);
		this.setOctet3(0);
		this.setOctet4(10);
	}
	
	
	/**
	 * @param octet1
	 * @param octet2
	 * @param octet3
	 * @param octet4
	 */
	public IP(int octet1, int octet2, int octet3, int octet4) {
		this.setOctet1(octet1);
		this.setOctet2(octet2);
		this.setOctet3(octet3);
		this.setOctet4(octet4);
	}



	//------------------------------------------setters/getters
	/**
	 * @return the octet1
	 */
	public int getOctet1() {
		return octet1;
	}


	/**
	 * @param octet1 the octet1 to set
	 */
	public void setOctet1(int octet1) {
		if(octet1 <256 && octet1 >= 0) {
			this.octet1 = octet1;
		}
	}


	/**
	 * @return the octet2
	 */
	public int getOctet2() {
		return octet2;
	}


	/**
	 * @param octet2 the octet2 to set
	 */
	public void setOctet2(int octet2) {
		if(octet2 <256 && octet2 >= 0) {
			this.octet2 = octet2;
		}
	}


	/**
	 * @return the octet3
	 */
	public int getOctet3() {
		return octet3;
	}


	/**
	 * @param octet3 the octet3 to set
	 */
	public void setOctet3(int octet3) {
		if(octet3 <256 && octet3 >= 0) {
			this.octet3 = octet3;
		}
	}


	/**
	 * @return the octet4
	 */
	public int getOctet4() {
		return octet4;
	}


	/**
	 * @param octet4 the octet4 to set
	 */
	public void setOctet4(int octet4) {
		if(octet4 <256 && octet4 >= 0) {
			this.octet4 = octet4;
		}
	}


	
	//----------------------------------------------------methode
	@Override
	public String toString() {
		return "IP [octet1=" + octet1 + ", octet2=" + octet2 + ", octet3=" + octet3 + ", octet4=" + octet4 + "]";
	}


	//---------------------------------------------------main
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IP myIp = new IP();
		//System.out.println(myIp.octet1 + "." + myIp.octet2 + "." + myIp.octet3 + "." + myIp.octet4);
		System.out.println(myIp);
	}

}
