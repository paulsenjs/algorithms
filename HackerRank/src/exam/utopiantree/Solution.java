package exam.utopiantree;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	static int t;
	static BigInteger input;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			input = sc.nextBigInteger();
			System.out.println(utopianTree());
		}
	}

	static int utopianTree(){
		return 0;
	}
}
