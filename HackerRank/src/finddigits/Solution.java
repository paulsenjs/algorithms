package finddigits;

import java.util.Scanner;

public class Solution {

	static int intInput;
	static long ANSWER=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		intInput = sc.nextInt();
		sc.nextLine();

		for (int i=0; i<intInput; i++) {
			String nextLineInput = sc.nextLine();
			for (int j=0; j<nextLineInput.length(); j++) {
				if (nextLineInput.charAt(j) != '0') {
					if (Integer.parseInt(nextLineInput) % Character.getNumericValue(nextLineInput.codePointAt(j)) == 0) {
						ANSWER++;
					}
				}
			}
			System.out.println(ANSWER);
			ANSWER=0;
		}
	}
}
