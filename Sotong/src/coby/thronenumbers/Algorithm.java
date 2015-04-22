package coby.thronenumbers;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

class Algorithm {
	static int Answer;
	static int mainLoop;
	static int firstRange;
	static int secondRange;

	static int[] temp = new int[1000001];
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		mainLoop = sc.nextInt();
//		long startTime = System.currentTimeMillis();
		
		for(int test_case = 0; test_case < mainLoop; test_case++) {
			sc.nextLine();
			
			firstRange = sc.nextInt();
			secondRange = sc.nextInt();
			
			for (int j=firstRange; j<= secondRange; j++) {
				if (temp[j] == 0){
					if (firstFormula(j) == secondFormula(j)){
						temp[j] = 1;
						Answer++;
					}
				}else{
					Answer += temp[j];
				}
			}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			Answer = 0;
		}
		
		/*long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time : " + formatter.format(totalTime / 1000d) + " seconds");*/
	}
	
	static long firstFormula (long param) {
		long formula = (param*param);
		long result = 0;
		/*String strFormula = String.valueOf(formula);
		char[] ch = strFormula.toCharArray();
		int length = (int)Math.log10(formula)+1;*/
		
		/*for (int i=0; i< length; i++) {
			result += ch[i]-'0';
		}*/
		while (formula > 0) {
			result = result + formula % 10;
            formula = formula / 10;
        }
		return result;
	}
	
	static long secondFormula (long param){
		long result = 0;
		/*int length = (int)Math.log10(param)+1;
		String strFormula = String.valueOf(param);
		char[] ch = strFormula.toCharArray();
		
		for (int i=0; i< length; i++) {
			result += ch[i]-'0';
		}*/
		while (param > 0) {
			result = result + param % 10;
			param = param / 10;
        }
		return (result*result);
	}
}
