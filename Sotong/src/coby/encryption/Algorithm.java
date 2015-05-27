package coby.encryption;

import java.util.Scanner;

class Algorithm {

	static int index;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {
			index = sc.nextInt();
			sc.nextLine();
			String text = sc.nextLine();

			int length;
			int initTextLength = text.length();
			if (initTextLength % index != 0) {
				length = Math.abs(text.length() / index) + 1;	
			}else{
				length = Math.abs(text.length() / index);
			}
			
			
			String[] arrSort = new String[length];
			StringBuilder initStr = new StringBuilder();
			initStr.append(text);
			
			int margin = text.length() % index;
			if (margin != 0) {
				for(int a=0; a<index-margin; a++) {
					initStr.append(" ");
				}
			}
			
			int j = 0, k = 0;
			for (int i = 0; i < initStr.length(); i++) {
				if ((i % index == 0) && (i > 0)) {
					arrSort[k] = initStr.substring(j, i);
					k++;
					j = i;
				}else{
					arrSort[k] = initStr.substring(j, initStr.length());
				}
			}

			StringBuilder strResult = new StringBuilder();
			for (int l=0; l<index; l++){
				for (int m=0; m<length; m++){
					strResult.append(arrSort[m].charAt(l));
				}
				if (l != index-1)
					strResult.append(" ");
			}
			
			System.out.println("Case #"+(test_case+1)+" : ["+strResult+"]");
		}
	}
}
