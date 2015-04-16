package thelovelettermystery;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	static int inputElementCount;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		inputElementCount = sc.nextInt();
		
		for (int i=0; i<inputElementCount; i++){
			if (!isPalindrome(sc.next())) {
				
			}
		}
	}
	
	static boolean isPalindrome(String param) {
		StringBuffer sb = new StringBuffer(param);
		if (sb.reverse().equals(param)){
			return true;
		}
		return false;
	}
	
	static int doChanged(String param) {
		int res = 0;
		Stack<Character> st = new Stack<>();
		for (int i=0; i<param.length(); i++) {
			char c = param.charAt(i);
			if (st.isEmpty()) {
				st.push(c);
			}else {
				
			}
		}
		
		return res;
	}
}
