package angryprofessor;

import java.util.Scanner;

public class Solution {

	static int intInput;
	static int intLoop;
	static int minStudents;
	static int negative;
	static int positive;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		intInput = sc.nextInt();
		sc.nextLine();

		
		for (int i=0; i<intInput; i++) {
			for (int j=0; j<2;j++) {
				intLoop = sc.nextInt();
				minStudents = sc.nextInt();
				negative=positive = 0;
				
				for (int k=0; k<intLoop; k++) {
					double next = sc.nextInt();
					if (next <= 0) {
						negative++;
					}else{
						positive++;
					}
				}
				if (negative >= minStudents) {
					System.out.println("NO");
				}else{
					System.out.println("YES");
				}
			}
		}
	}
}
