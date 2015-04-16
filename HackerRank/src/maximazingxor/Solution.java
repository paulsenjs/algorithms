package maximazingxor;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int input;
	static int[] arrInput = new int[2];
	static int[] arrResult = new int[10000000];
	static int l;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<2; i++) {
			arrInput[i] = sc.nextInt();
		}
		
		l = 0;
		for (int j = arrInput[0]; j<=arrInput[1]; j++) {
			for (int k = j; k <= arrInput[1]; k++) {
				arrResult[l] = j ^ k;
				l++;
			}
		}
		
		Arrays.sort(arrResult);
		System.out.println(arrResult[arrResult.length-1]);
	}
}
