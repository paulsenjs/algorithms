package coby.factorial;

import java.util.Scanner;

class Algorithm {
	static int Answer=1;
	static String strNextLine;
	
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		strNextLine = sc.nextLine();
		for(int test_case = 0; test_case < T; test_case++) {
			strNextLine = sc.nextLine();
			
			for (int i = 0; i <= Integer.parseInt(strNextLine); i++) {
				Answer *= factorial(i);
			}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			Answer = 1;
		}
	}
	
	static int factorial(int n) {
		if (n==0)
			return 1;
		else			
			return n * factorial(n-1);
	}
}
