package coby.multiplication;

import java.util.Scanner;

class Algorithm {
	static int Answer;
	static String strNextLine;
	
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		strNextLine = sc.nextLine();
		for(int test_case = 0; test_case < T; test_case++) {
			strNextLine = sc.nextLine();
			
			for (int i=0; i<Integer.parseInt(strNextLine); i++) {
				if ((i%3==0) || (i%5==0)){
					Answer += i;
				}
			}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			Answer = 0;
		}
	}
}
