package chocolatefeast;

import java.util.Scanner;

public class Solution {

	static int intInput;
	static long ANSWER=0;
	static int N, C, M;
	static int _donuts = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		intInput = sc.nextInt();

		for (int i=0; i<intInput; i++) {
			sc.nextLine();
			N = sc.nextInt();
			C = sc.nextInt();
			M = sc.nextInt();
			
			if ((N / C) == M) {
				ANSWER = M+1;
			}else if ((N / C) < M) {
				ANSWER = (N / C);
			}else{
				ANSWER = (N / C) + iterateWrappers((N / C), M);
			}
			
			System.out.println(ANSWER);
			ANSWER=0;
		}
	}
	
	static int iterateWrappers(int wrappers, int changed) {
		if (wrappers < changed) {
			return _donuts;
		}else {
			if (wrappers % changed != 0) {
				_donuts += (Math.floor(wrappers / changed) + (wrappers - changed))/2; 
			}
		}
		return iterateWrappers(_donuts, changed);
	}
}
