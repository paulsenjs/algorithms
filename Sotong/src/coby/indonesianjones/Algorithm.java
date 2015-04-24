package coby.indonesianjones;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

class Algorithm {
    
	static long Answer;
	static int mainLoop;
	static int secondLoop;
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		mainLoop = sc.nextInt();
//		long startTime = System.currentTimeMillis();
		
		for(int test_case = 0; test_case < mainLoop; test_case++) {
			sc.nextLine();
			secondLoop = sc.nextInt();
			
			long[][] x = new long[secondLoop][secondLoop];
			for (int j=0; j<secondLoop; j++) {
				for (int k=0; k<=j; k++) {
					x[j][k] = sc.nextLong();
				}
			}
			
			if (x.length < 2) {
				Answer = x[0][0];
			}else {
				for (int a=x.length-2; a>=0; a--){
					for (int b=0; b<=a; b++) {
						x[a][b] += Math.max(x[a+1][b], x[a+1][b+1]);
//						System.out.println("x["+a+"]["+b+"] = x["+a+"]["+b+"] + max(x["+(a+1)+"]["+b+"] - x["+(a+1)+"]["+(b+1)+"]" );
						Answer = x[a][b];
					}
				}				
			}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			Answer = 0;
		}
		
//		long endTime   = System.currentTimeMillis();
//		long totalTime = endTime - startTime;
//		NumberFormat formatter = new DecimalFormat("#0.00000");
//		System.out.print("Execution time : " + formatter.format(totalTime / 1000d) + " seconds");
	}
}
