package Bitmasking;

import java.util.Arrays;
import java.util.Scanner;

public class BagProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[] = new int[m];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(makeBage(arr, n));
		}

	}

	public static int makeBage(int[] arr, int n) {
		// TODO Auto-generated method stub
		int ans = -1;
		int[] pow = new int[65];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			pow[(int) (Math.log(arr[i]) / Math.log(2))]++;
		}
		if (sum < n) {
			return ans;
		}
		System.out.println(Arrays.toString(pow));
		int i = 0;
		ans = 0;
		while (i <= 60) {
			if ((n & 1) == 1) {
				if (pow[i] > 0) {
					pow[i]--;

				} else {
					ans++;
				}
			}
			i++;
		}
		return ans;
	}

}
