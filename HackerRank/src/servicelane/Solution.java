package servicelane;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	/**
	 * @param args
	 */
	

	static int ANSWER;
	static int input;
	static String strPath;
	static char[] arr;
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		input = in.nextInt();
		input = in.nextInt();
		
		in.nextLine();
		
		strPath = in.nextLine();
		strPath = strPath.replace(" ", "");
		
		
		for (int _a_i = 0; _a_i < input; _a_i++) {
			int first = in.nextInt();
			int second = in.nextInt();
			
			arr = new char[(second - first)+1];
			int k=0;
			for (int j=first; j<= second; j++) {
				arr[k] = strPath.charAt(j);
				k++;
			}
			
			Arrays.sort(arr);
			System.out.println(arr[0]);
		}
	}
}




