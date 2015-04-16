package lonelyinteger;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	/**
	 * @param args
	 */

	static String strInput;
	static int[] arrInput;
	static int ANSWER;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		if (input == 1){
			ANSWER = 1;
		}else {
			arrInput = new int[input];
			for (int i = 0; i<input; i++) {
				arrInput[i] = in.nextInt();
			}
			
			Arrays.sort(arrInput);
			
			Stack<Character> st = new Stack<>();
			for (int j =0; j<arrInput.length; j++) {
				char c = (char) arrInput[j];
				if (st.isEmpty()) {
					st.push(c);
				}else{
					if (c==st.peek()) {
						st.pop();
					}else{
						st.push(c);
					}
				}
			}
			
			ANSWER = st.firstElement();
		}
		
		System.out.println(ANSWER);
	}
}
