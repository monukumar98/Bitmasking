package LiveAug;

public class BitMaskinglec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		odd_even(8);
//		System.out.println((10 >> 1));// right
//		System.out.println(-10 << 2); // left
//		System.out.println(ithbit(39, 2));
		int[] arr = { 2, 3, 2, 3, 7, 5 };
//		UniqI(arr);
//		System.out.println(SetBit(39));
//		System.out.println(FastSetBit(39));

		// 1st 1 <----
		// n & (~(n-1))
//		System.out.println(magicno(7));
		Uniq_No_II(arr);

	}

	public static void UniqI(int[] arr) {
		// TODO Auto-generated method stub
		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			ans ^= arr[i];

		}
		System.out.println(ans);
	}

	public static void odd_even(int n) {
		// odd
		if ((n & 1) == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
	}

	public static int ithbit(int n, int i) {
		int mask = 1 << (i - 1); // mask
		if ((n & mask) == 0) {
			return 0;
		} else {
			return 1;

		}
	}

	public static int SetBit(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}

// O(no of set bit)
	public static int FastSetBit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = (n & (n - 1));
		}
		return count;
	}

	public static int magicno(int n) {
		int mul = 5;
		int ans = 0;
		while (n > 0) {
			ans = ans + (n & 1) * mul;
			n >>= 1;
			mul *= 5;
		}
		return ans;
	}

	public static void Uniq_No_II(int arr[]) {
		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			ans ^= arr[i];

		}
		int n = ans;
		n = n & (~(n - 1));
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & n) >= 1) {
				a ^= arr[i];
			}

		}
		System.out.println(a + " " + (ans ^ a));

	}

}
