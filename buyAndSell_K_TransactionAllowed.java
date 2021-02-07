import java.util.*;

public class buyAndSell_K_TransactionAllowed {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int[][] dp = new int[k + 1][n];
		for (int t = 1; t <= k; t++) {
			for (int d = 1; d < n; d++) {
				int max = dp[t][d - 1];

				for (int pd = 0; pd < d; pd++) {
					int profitTillTm1 = dp[t - 1][pd];
					int ptth = arr[d] - arr[pd];
					if (ptth + profitTillTm1 > max) {
						max = ptth + profitTillTm1;
					}
				}
				dp[t][d] = max;
			}
		}
		System.out.println(dp[k][n-1]);
	}
}
