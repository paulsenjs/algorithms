package coby.jakartaskyline;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

class Algorithm {
	static int Answer;
	static int mainLoop;
	static int firstRange;
	static int secondRange;

	static int[] temp = new int[1000001];
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		mainLoop = sc.nextInt();
		long startTime = System.currentTimeMillis();
		
		for(int test_case = 0; test_case < mainLoop; test_case++) {
			sc.nextLine();
			
			firstRange = sc.nextInt();
			secondRange = sc.nextInt();
			
			for (int j=firstRange; j<= secondRange; j++) {
				
			}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			Answer = 0;
		}
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time : " + formatter.format(totalTime / 1000d) + " seconds");
	}
}
