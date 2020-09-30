package Bitmasking;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(count_problem_set(arr, n, l, r, x));
		

	}

	public static int count_problem_set(int[] arr, int n, int l, int r, int x) {

		int ans = 0;
		for (int i = 3; i < (1 << n); i++) {
			if (setbit(i) >= 2) {
				int sum = 0;
				int min = 0;
				int max = 0;
				boolean f = false;
				for (int j = 0; j < arr.length; j++) {
					if ((i & (1 << j)) >= 1) {
						sum += arr[j];
						if (!f) {
							f = true;
							min = arr[j];
						}
						max = arr[j];
					}
				}

				if (max - min >= x && sum >= l && sum <= r) {
					ans += 1;
					//System.out.println("i = " + i + " " + ans);
				}

			}

		}
		return ans;
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
