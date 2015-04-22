package coby.left4drunk;

import java.util.Scanner;

class Algorithm {
	static int intInput;
	static int ANSWER;
	static int temp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		intInput = sc.nextInt();

		for (int i=0; i<intInput; i++) {
			sc.nextLine();
			int bottles = sc.nextInt();
			temp = bottles;
			while (temp / 4 > 0) {
				ANSWER += temp / 4; 
				temp = (temp / 4) + (temp % 4);
			}
			System.out.println("Case #"+(i+1));
			System.out.println(ANSWER+bottles);
			ANSWER = 0;
		}
	}
}
