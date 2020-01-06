/**
 * 
 */
package tp4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author sebastien
 *
 */
public class IP {
	
	private int octet1;
	private int octet2;
	private int octet3;
	private int octet4;
	private String ipv4;


	
	public IP() {
		this.setOctet1(127);
		this.setOctet2(0);
		this.setOctet3(0);
		this.setOctet4(1);
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

	
	public IP(String ip) {
		ipv4 = ip;
	}
	

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
		if(octet1 >= 0 && octet1 < 256)
			this.octet1 = octet1;
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
		if(octet2 >= 0 && octet2 < 256)
			this.octet2 = octet2;
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
		if(octet3 >= 0 && octet3 < 256)
			this.octet3 = octet3;
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
		if(octet4 >= 0 && octet4 < 256)
			this.octet4 = octet4;
	}


	@Override
	public String toString() {
		return "IP [octet1=" + octet1 + ", octet2=" + octet2 + ", octet3=" + octet3 + ", octet4=" + octet4 + "]";
	}


	public int compareTo(IP e) {
		IP ip1 = new IP();
		if (ip1.octet1 < e.octet1) return -1;
		if (ip1.octet1 > e.octet1) return 1;
		if (ip1.octet2 < e.octet2) return -1;
		if (ip1.octet2 > e.octet2) return 1;
		if (ip1.octet3 < e.octet3) return -1;
		if (ip1.octet3 > e.octet3) return 1;
		if (ip1.octet4 < e.octet4) return -1;
		if (ip1.octet4 > e.octet4) return 1;
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
		IP other = (IP) obj;
		if (octet1 != other.octet1)
			return false;
		if (octet2 != other.octet2)
			return false;
		if (octet3 != other.octet3)
			return false;
		if (octet4 != other.octet4)
			return false;
		return true;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//IP myIp = new IP();
		/*myIp.octet1 = Integer.parseInt(args[0]);
		myIp.octet2 = Integer.parseInt(args[1]);
		myIp.octet3 = Integer.parseInt(args[2]);
		myIp.octet4 = Integer.parseInt(args[3]);
		System.out.println(myIp.octet1 + "." + myIp.octet2 + "." + myIp.octet3 + "." + myIp.octet4);*/
		//System.out.println(myIp.compareTo(new IP(127, 0, 0, 1)));
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une adresse ip sous le format 'x.x.x.x'");
		String strIp = sc.nextLine();
		IP ip1 = new IP(strIp);
		System.out.println(ip1.ipv4);
		System.out.println("Entrez une date sous le format 'dd/mm/yyyy'");
		String strDate = sc.nextLine();
		DateF date1 = new DateF(strDate);
		System.out.println(date1.getDateString());*/
		
		try {
	    String content = "fantuzzi;sebastien;200000\r\n" + 
	    		"pastori;lucas;200001\r\n" + 
	    		"tang;jm;200002";
	      BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\sebastien\\Documents/monfichier.txt"));
	    bw.write(content);
	    bw.close();
	}
	catch (IOException e)
	{
	    System.err.println("Erreur lors de l'écriture dans le fichier");
	}

	}

}
