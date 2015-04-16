package coby.evenfibo;

import java.util.Scanner;

class Algorithm {
	static int Answer;
	static String strNextLine;
	static int intFibo;
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		strNextLine = sc.nextLine();
		
		for(int test_case = 0; test_case < T; test_case++) {
			strNextLine = sc.nextLine();
			
			for (int i=0; i<=Integer.parseInt(strNextLine); i++) {
				if (fib(i) %2 == 0) {
					Answer += fib(i);
				}
			}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			Answer = 0;
		}
	}
	
	static int fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
	
	static double fib(int n) {
		double prev=0d;
		double next=1d;
		double result=0d;
		
		for (int i = 1; i <n; i++) {
			result=prev+next;
	        prev=next;
	        next=result;
	    }
	    return result;
	}
}
