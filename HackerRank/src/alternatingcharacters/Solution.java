package alternatingcharacters;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	static int inputElementCount;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		inputElementCount = sc.nextInt();
		
		for (int i=0; i<inputElementCount; i++){
			System.out.println(doDeletions(sc.next()));
		}
	}

	static int doDeletions(String param) {
		Stack<Character> stChar = new Stack<>();
		int res = 0;
		for (int j=0; j<param.length(); j++) {
			char c = param.charAt(j);
			if (stChar.isEmpty()) {
				stChar.push(c);
			}else {
				if (c == stChar.peek()){
					stChar.pop();
					stChar.push(c);
					res++;
				}else{
					stChar.push(c);
				}
			}
		}
		return res;
	}
}
