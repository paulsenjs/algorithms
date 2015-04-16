package utopiantree;

import java.util.Scanner;

	public class Solution {
		
		static int t;
		static int input;
		static int[] array = new int[100];
	
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			t = sc.nextInt();
			
			for (int i = 1 ; i <= t ; i++) {
	            array[i] = sc.nextInt();
	        }
	
	        for (int i = 1 ; i <= t ; i++) {
	            int num = 1;
	            if (array[i] == 0) {
	                System.out.println("1");
	            } else {
	                for (int j = 1 ; j <= array[i] ; j++) {
	                    if (j % 2 != 0) {
	                        num = num * 2;
	                    } else {
	                        num = num + 1;
	                    }
	                }
	                System.out.println(num);
	            }
	        }
	        
		}
	}
