package com.samsung.sotong;

import java.util.Scanner;

public class Cheerleaders {

	static int N;
	static String strInput;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		strInput = sc.nextLine();
		for(int test_case = 0; test_case < T; test_case++) {
//			N = sc.nextInt();
			/**********************************
			*  Implement your algorithm here. *
			***********************************/
			strInput = sc.nextLine();
			// Print the answer to standard output(screen).
			permutation("", strInput);
			System.out.println();
		}
	}
	
	public static void permutation(String prefix, String str) {
	    int n = str.length();
	    
	    if (n == 0)
	    	System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}
