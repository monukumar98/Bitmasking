package Bitmasking;

import java.util.Scanner;

public class PrincipleofIncandExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			System.out.println(totaldivisor(n));
		}

	}

	public static long totaldivisor(long d) {
		int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19 };
		int n = arr.length;
		long tn = 0;
		for (int i = 1; i < (1 << n); i++) {
			int ans = 1;
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) >= 1) {

					ans *= arr[j];
				}

			}
			int bt_count = setbit(i);

			if ((bt_count & 1) == 1) {

				tn = tn + (d / ans);
			} else {

				tn = tn - (d / ans);
			}

		}
		return tn;

	}

	public static int setbit(int i) {
		int c = 0;
		while (i > 0) {
			i = (i & (i - 1));
			c++;

		}
		return c;
	}

}
