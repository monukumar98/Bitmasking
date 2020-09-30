package Bitmasking;

public class SubSequanceUSingBitMAsking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long start = System.currentTimeMillis();
		 String str = "abc";
	//	String str = "abc";
		SubSeq(str, str.length());
		long end = System.currentTimeMillis();
		 System.out.println(end-start);

	}

	public static void SubSeq(String str, int length) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1 << length; i++) {
			print(str, i);
		}

	}

	public static void print(String str, int i) {
		int pos = 0;
		while (i > 0) {
			int last_bit = i & 1;
			if (last_bit == 1) {
				System.out.print(str.charAt(pos));
			}
			pos++;
			i >>= 1;
		}
		System.out.println();
	}

}
