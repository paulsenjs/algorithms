package coby.encryption;

import java.util.Scanner;

class Algorithm {
	
	static int index;
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			index = sc.nextInt();
			sc.nextLine();
			String text = sc.nextLine();
			
			int length = Math.abs(text.length()/index)+1;
			String[] arrSort = new String[length]; 
			
			int j = 0, k = 0;
			for (int i=0; i<text.length(); i++) {
				if ((i % 5 == 0) && (i > 0)) {
					System.out.println(j +" - "+ i);
					arrSort[k] = text.substring(j, i);
					k++;
					j = i;
				}
			}
			arrSort[k] = text.substring(j, text.length());
			
			int[][] newArrSort = new int[length][length];
			
			for (int l=0; l<length; l++) {
				for (int m=0; m<length ; m++){
					newArrSort[l][m] = arrSort[l].charAt(m);
				}
			}
			
			
			
			System.out.println(newArrSort);
		}
	}
}

/*Input

2

5

Pada hari minggu kuturut ayah ke kota.

4

Naik delman istimewa kududuk di muka.

Output

Case #1 : [Phmuuakt aai ryea drnkua . aiguthk    gt  o ]

Case #2 : [N mim u m. adasekddu  ientwuuik  kl iadk a ]
*/


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
