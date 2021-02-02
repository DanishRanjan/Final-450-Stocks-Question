import java.util.*;
public class buyAndSellStocksOneTransactonAllowed {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] price = new int[n];
	for(int i=0;i<n;i++) {
		price[i] = sc.nextInt();
	}
	
	int lsf = Integer.MAX_VALUE;         //least so far
	int op = 0;                          //overall profit
	int pist = 0;                        //profit if sell today
	
	for(int i=0;i<n;i++) {
		if(price[i]< lsf) {
			lsf = price[i];
		}
		pist = price[i]-lsf;
		if(pist>op) {
			op = pist;
		}
	}
	
	System.out.println(op);
}
}
