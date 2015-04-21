package chocolatefeast;

import java.util.Scanner;

public class Solution {

	static int intInput;
	static long ANSWER=0;
	static int N, C, M;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		intInput = sc.nextInt();

		for (int i=0; i<intInput; i++) {
			sc.nextLine();
			N = sc.nextInt();
			C = sc.nextInt();
			M = sc.nextInt();
			
			ANSWER = (N / C) + countWrappers((N / C), M);
			
			System.out.println(ANSWER);
			ANSWER=0;
		}
	}
	
	static int countWrappers(int wrappers, int changed) {
		int _donuts = 0;
		while (wrappers / changed > 0) {
			_donuts += wrappers / changed;
			wrappers = (wrappers / M) + (wrappers % M);
		}
		
		return _donuts;
	}
}
