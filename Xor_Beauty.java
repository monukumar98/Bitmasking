package Bitmasking;

import java.util.*;

public class Xor_Beauty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(~(-4));
		int n = sc.nextInt();
		int q = sc.nextInt();
		String str = sc.next();
		while (q-- > 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			HashMap<Character, Integer> map = new HashMap<>();
			for (int i = l - 1; i < r; i++) {
				if (map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
				} else {
					map.put(str.charAt(i), 1);
				}

			}
			ArrayList<Integer> value = new ArrayList<Integer>(map.values());
			if (value.size() >= 1) {
				int ans = value.get(0);
				for (int i = 1; i < value.size(); i++) {
					ans ^= value.get(i);
				}
				System.out.println(ans);
			} else {
				System.out.println(0);
			}

		}

	}

}
