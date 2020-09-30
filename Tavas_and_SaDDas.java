package Bitmasking;

import java.util.Scanner;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ans = 0;
		ans = (1 << str.length()) - 2;
		int pos = 0;
		for (int i = str.length()-1; i>=0;  i--) {
			if (str.charAt(i) == '7') {
				ans += (1 << pos);
			}
			pos++;

		}
		System.out.println(ans+1);

	}

}
