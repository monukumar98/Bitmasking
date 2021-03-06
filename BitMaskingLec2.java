package LiveAug;

import java.util.Scanner;

public class BitMaskingLec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String str = "abc";
//		SubBitMasking(str);
//		int arr[] = { 2, 3, 5, 7, 11 };
//		System.out.println(total_no_of_div(arr, 1000));
//		int[] arr1 = { 3, 2, 3, 5, 3, 5, 5 };
//		System.out.println(Unq_no_III(arr1));
//		int n = sc.nextInt();
//		int l = sc.nextInt();
//		int r = sc.nextInt();
//		int x = sc.nextInt();
//		int arr[] = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		// System.out.println(problem_set(arr, n, l, r, x));
		String str = sc.next();
		System.out.println(Tavas_and_SaDDas(str));

	}

	public static void SubBitMasking(String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < (1 << str.length()); i++) {
			pattren(str, i);

		}

	}

	public static void pattren(String str, int i) {
		int pos = 0;
		while (i > 0) {
			if ((i & 1) == 1) { //
				System.out.print(str.charAt(pos));// mul
			}
			i >>= 1;
			pos++;
		}
		System.out.println();

	}

	public static int total_no_of_div(int arr[], int d) {
		int n = arr.length;
		int res = 0;
		for (int i = 1; i < (1 << n); i++) {
			int ans = pattren_DIV(arr, i);
			if ((FastSetBit(i) & 1) == 1) {
				res = res + d / ans;
			} else {
				res = res - d / ans;
			}

		}
		return res;
	}

	public static int pattren_DIV(int arr[], int i) {
		int pos = 0;
		int ans = 1;
		while (i > 0) {
			if ((i & 1) == 1) {
				ans *= arr[pos];//
			}
			i >>= 1;
			pos++;
		}
		return ans;

	}

	public static int FastSetBit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = (n & (n - 1));
		}
		return count;
	}

	public static int Unq_no_III(int[] arr) {
		int[] cn = new int[32]; // 10^9 > 64 size array
		for (int i = 0; i < arr.length; i++) {
			int no = arr[i];
			int pos = 0;
			while (no > 0) {
				if ((no & 1) == 1) {
					cn[pos]++;
				}
				no >>= 1;
				pos++;
			}

		}
		for (int i = 0; i < cn.length; i++) {
			cn[i] = cn[i] % 3;
		}
		int ans = 0;
		int mul = 1;
		for (int i = 0; i < cn.length; i++) {
			ans = ans + cn[i] * mul;
			mul *= 2;
		}
		return ans;

	}

	public static int problem_set(int[] arr, int n, int l, int r, int x) {
		int ans = 0;

		for (int i = 3; i < (1 << n); i++) {
			if (FastSetBit(i) >= 2) { //
				if (issafe(arr, l, r, x, i)) {
					ans++;
				}
			}

		}
		return ans;
	}

	public static boolean issafe(int arr[], int l, int r, int x, int i) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int pos = 0;
		while (i > 0) {
			if ((i & 1) == 1) {
				sum += arr[pos];
				min = Math.min(min, arr[pos]);
				max = Math.max(max, arr[pos]);
			}
			i >>= 1;
			pos++;
		}
		return max - min >= x && sum >= l && sum <= r;

	}

	public static int Tavas_and_SaDDas(String str) {
		int ans = (1 << str.length()) - 2;
		int pos = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '7') {
				ans = ans + (1 << pos);
			}
			pos++;

		}
		return ans + 1;

	}

}
