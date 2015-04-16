package exam.flippingbits;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	static int t;
	static BigInteger input;
	static BigInteger binary;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			input = sc.nextBigInteger();
			System.out.println(flippingBits(input));
		}
	}

	static BigInteger flippingBits(BigInteger param) {
		binary = new BigInteger(param.toString(2));
		StringBuffer strBuf = new StringBuffer(String.format("%32s", binary).replace(' ', '0'));

		BigInteger bigInteger = new BigInteger(doReverse(strBuf.toString()), 2);
		return bigInteger;
	}

	static String doReverse(String param) {
		StringBuffer newStrBuf = new StringBuffer(32);
		for (int i = 0; i < param.length(); i++) {
			char c = param.charAt(i);
			if (c == '1') {
				newStrBuf.append('0');
			} else {
				newStrBuf.append('1');
			}
		}
		
		return newStrBuf.toString();
	}
}

//1
//4294967295