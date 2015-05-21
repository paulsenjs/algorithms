package coby.charactermining;

import java.util.Scanner;

class Algorithm {
	static int Answer1, Answer2;
	static int a, b, c;
	static int[][][] stack;
	static int[] x;
	static int[] y;
	static int[] z;
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			int var = sc.nextInt();
			stack = new int[var][var][var];
			
			x = new int[var];
			y = new int[var];
			z = new int[var];
			
			for (int j=0; j<var; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				if (a == 0) {
					y[j] = a;
					x[j] = b;
				}else if (b == 0) {
					y[j] = a;
					z[j] = b;
				}else {
					//check the last position of the similar value;
					//you can exactly sure whether it's son or parent or brother.
				}
			}
		}
	}
}


/*Input
2
5
1 0
4 0
0 2
3 2
5 3
1
0 1

Output
Case #1 :
Eldest     : 2
SameGen    : 3
Younglings : 1 4 5
Case #2 :
Eldest     : 1
SameGen    : none
Younglings : none
*/
	