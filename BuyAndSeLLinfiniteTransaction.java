import java.util.*;
public class BuyAndSeLLinfiniteTransaction {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	
	int buyingDate = 0;
	int sellingDate = 0;
	int profit = 0;
	
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>=arr[i-1]) {
			sellingDate++;
		}else {
			profit = profit+ arr[sellingDate]-arr[buyingDate];
			buyingDate = sellingDate = i;
		}
	}
	profit = profit+arr[sellingDate] - arr[buyingDate];
	
	System.out.println(profit);
}
}
