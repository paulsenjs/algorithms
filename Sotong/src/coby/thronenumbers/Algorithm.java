package coby.thronenumbers;

import java.util.Scanner;

class Algorithm {
	static int Answer;
	static int mainLoop;
	static int intFibo;
	static int firstRange;
	static int secondRange;
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		mainLoop = sc.nextInt();
		for(int test_case = 0; test_case < mainLoop; test_case++) {
			sc.nextLine();
			
			firstRange = sc.nextInt();
			secondRange = sc.nextInt();
			
			for (int j=firstRange; j<= secondRange; j++) {
				if (firstFormula(j) == secondFormula(j)){
					Answer++;
				}
			}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			Answer = 0;
		}
	}
	
	static int firstFormula (int param) {
		int formula = (int)Math.pow(param, 2);
		int result = 0;
		for (int i=0; i< String.valueOf(formula).length(); i++) {
			result += Character.getNumericValue(String.valueOf(formula).charAt(i));
		}
		return result;
	}
	
	static int secondFormula (int param){
		int result = 0;
		for (int i=0; i< String.valueOf(param).length(); i++) {
			result += Character.getNumericValue(String.valueOf(param).charAt(i));
		}
		return (int)Math.pow(result, 2);
	}
}
