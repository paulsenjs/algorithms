package coby.thegreatdevide;

import java.util.Scanner;

class Algorithm {
	static int intInput;
	static double firstDevide;
	static double secondDevide;
	static int total; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		intInput = sc.nextInt();

		for (int i=0; i<intInput; i++) {
			int nextLine = sc.nextInt();
			for(int j=1; j<=nextLine; j++) {
				int nextInt = sc.nextInt();
				total += nextInt;
			}
			
			firstDevide = Math.ceil(total/2);
			secondDevide = total - firstDevide;
			
			System.out.println("Case #"+(i+1));
			System.out.println((int)secondDevide);
			System.out.println((int)firstDevide);
			
			firstDevide = 0;
			secondDevide = 0;
			total = 0;
		}
	}
}
