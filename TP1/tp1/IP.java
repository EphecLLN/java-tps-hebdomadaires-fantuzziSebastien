/**
 * 
 */
package tp1;


/**
 * @author sebastien
 *
 */
public class IP {
	
	int octet1;
	int octet2;
	int octet3;
	int octet4;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IP myIp = new IP();
		myIp.octet1 = Integer.parseInt(args[0]);
		myIp.octet2 = Integer.parseInt(args[1]);
		myIp.octet3 = Integer.parseInt(args[2]);
		myIp.octet4 = Integer.parseInt(args[3]);
		System.out.println(myIp.octet1 + "." + myIp.octet2 + "." + myIp.octet3 + "." + myIp.octet4);


	}

}
