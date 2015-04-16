package com.samsung.sotong;

import java.util.Scanner;

public class SerialDigitPrimeNumber {

	static int N;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//sc = new Scanner(new FileInputStream("input.txt"));

		SerialDigitPrimeNumber serialDigitPrimeNumber = new SerialDigitPrimeNumber();

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			N = sc.nextInt();
			
			/**********************************
			*  Implement your algorithm here. *
			***********************************/

			// Print the answer to standard output(screen).

			String maxDigit = "99999999";
			int i;
			/*for (; i <= Integer.parseInt(maxDigit.substring(0, N)); i++){
				if ((i % 2) != 0) {
					System.out.println(i);
				}
			}*/
			int status = 1, num = 3;
			if (N >= 1)
		      {
		         System.out.println(2);
		      }
		 
		      for ( i = 2 ; i <=N ;  )
		      {
		         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
		         {
		            if ( num%j == 0 )
		            {
		               status = 0;
		               break;
		            }
		         }
		         if ( status != 0 )
		         {
		            System.out.println(num);
		            i++;
		         }
		         status = 1;
		         num++;
		      }  
		}
	}
}
