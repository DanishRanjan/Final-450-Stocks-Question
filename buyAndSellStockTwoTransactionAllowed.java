import java.util.*;

public class buyAndSellStockTwoTransactionAllowed {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int lsf = arr[0]; // Least so far
		int mpist = 0; //maximum profit if sell today
		int[] dpl = new int[arr.length]; //traversing from left to right 
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < lsf) {
				lsf = arr[i];
			}
			mpist = arr[i] - lsf;
			if (mpist > dpl[i - 1]) {
				dpl[i] = mpist;
			} else {
				dpl[i] = dpl[i - 1];
			}
		}

		int msf = arr[arr.length - 1]; // Maximum So far
		int mpibt = 0; //maximum profit if bought today
		int[] dpr = new int[arr.length]; //traversing from right to left
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > msf) {
				msf = arr[i];
			}
			mpibt = msf - arr[i];
			if (mpibt > dpr[i + 1]) {
				dpr[i] = mpibt;
			} else {
				dpr[i] = dpr[i + 1];
			}
		}

		int op = 0; // overall profit
		for (int i = 0; i < arr.length; i++) {
			if (dpl[i] + dpr[i] > op) {
				op = dpl[i] + dpr[i];
			}
		}

		System.out.println(op);

	}
}
