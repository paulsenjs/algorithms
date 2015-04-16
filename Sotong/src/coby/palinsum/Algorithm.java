package coby.palinsum;

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
			
			for (int i=1; i<= Integer.parseInt(strNextLine); i++) {
				if ((i<10) || (isPalindrome(String.valueOf(i)))) {
					Answer ++;
				}
			}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			Answer = 0;
		}
	}
	
	static boolean isPalindrome(String word) {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(word);
		if (word.equalsIgnoreCase(strBuffer.reverse().toString())) {
			return true;
		}
		return false;
	}
}
