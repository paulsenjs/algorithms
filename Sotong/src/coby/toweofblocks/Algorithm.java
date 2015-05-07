package coby.toweofblocks;

import java.util.Arrays;
import java.util.Scanner;

class Algorithm {
	static int Answer;
	static int nextLine;
	static int[] dimension;
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();

		dimension = new int[3];
		for(int test_case = 0; test_case < T; test_case++) {
			nextLine = sc.nextInt();
			for (int i=0; i<nextLine; i++) {
				int p = sc.nextInt();
				int l = sc.nextInt();
				int t = sc.nextInt();
				
				if ((p == l) && (p == t) && (l == t)) {
					Answer += p;
				}else{
					dimension[0] = p;
					dimension[1] = l;
					dimension[2] = t;
					
					Arrays.sort(dimension);
					Answer += dimension[0] + dimension[2];
				}
			}
			
			System.out.println("Case #"+(test_case+1)+" : " +Answer);
			Answer = 0;
		}
	}
	
}
