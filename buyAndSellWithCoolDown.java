import java.util.*;

public class buyAndSellWithCoolDown {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int obsp = -arr[0]; // old bought state profit
		int ossp = 0; // old sold state profit
		int ocsp = 0; // old cooldown state profit

		for (int i = 1; i < arr.length; i++) {
			int nbsp = 0; // new bought state profit
			int nssp = 0; // new sold state profit
			int ncsp = 0; // new cooldown state profit

			if (ocsp - arr[i] > obsp) { // arranging table of  BUYING
				nbsp = ocsp - arr[i];
			} else {
				nbsp = obsp;
			}

			if (obsp + arr[i] > ossp) { // arranging table of SELLING
				nssp = obsp + arr[i];
			} else {
				nssp = ossp;
			}
			
			if(ossp>ocsp) { //// arranging table of COOLDOWN
				ncsp = ossp;
			}else {
				ncsp = ocsp;
			}
			
			obsp = nbsp;
			ossp = nssp;
			ocsp = ncsp;
		}
		System.out.println(ossp);
	}
}
