package halloweenparty;

import java.util.Scanner;

public class Solution {

	static int intInput;
	static int ANSWER;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		intInput = sc.nextInt();
		sc.nextLine();

		for (int i=0; i<intInput; i++) {
			String nextLineInput = sc.nextLine();
			if (Integer.parseInt(nextLineInput) %2 == 0) {
				ANSWER = (int) Math.pow((double)Integer.valueOf(nextLineInput)/2, 2);
			}else{
				ANSWER = (int) (Math.ceil((double)Integer.valueOf(nextLineInput)/2) * Math.floor((double)Integer.valueOf(nextLineInput)/2));
			}
			System.out.println(ANSWER);
		}
	}
}
