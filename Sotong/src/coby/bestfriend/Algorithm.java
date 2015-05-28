package coby.bestfriend;

import java.util.Arrays;
import java.util.Scanner;

class Algorithm {
	
	static int N, K;
	static int[] arrN;
	static int[] arrAn;
	static int Answer=0;
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		/*long startTime = System.currentTimeMillis();*/
		
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			N = sc.nextInt();
			K = sc.nextInt();
			
			arrN = new int[N];
			for (int i=0; i<N; i++) {
				arrN[i] = sc.nextInt();
			}
			
			Arrays.sort(arrN);
			for (int j=0; j<N-1; j++){
				int result = (arrN[j] + K);
				for (int m=j+1; m<N; m++){
					if (arrN[m] > result){
						break;
					}
					if (arrN[m] == result){
						Answer++;
						break;
					}
				}
			}
			
			System.out.println("Case #"+test_case+1+" : "+Answer);
			Answer = 0;
		}
		
		/*long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time : " + formatter.format(totalTime / 1000d) + " seconds");*/
	}
}

/*Best Friend Numbers



A number’s best friend will always be another number that is K numbers away from his location. Find out how many numbers could be paired as a BF-Numbers on a collection of N numbers.
The numbers appearing on the collection of N numbers will always be a unique number. N would not exceed 10^5. The difference K is always inside the range of 0 < K < 10^9. The numbers appearing as those N unique numbers will be greater than 0 and will never exceed 2^31-K.


Input
The first line of the input will be an integer T defining the total test case that will appear. The next T test cases (1 <= T <= 20) will be started with two integers N and K. The second line of each test case will contain N unique numbers.


Output
For each test case, print “Case #T : “ followed by the total BF-number found on the collection of N numbers.


Sample I/O :
Input
2

5 3

10 3 7 6 4

4 1

12345 678910 11121314 15161718


Output
Case #1 : 3

Case #2 : 0


Explanation
Case #1
On case 1, there will be 3 pairs of BF-numbers with distance (K) of 3 :

10-7

7-4

3-6


Case #2
On case 2, there is no pair of BF-numbers because there are no pairs of numbers that is 1 distance away from any of the other numbers.
*/
