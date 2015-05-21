package coby.familytree;

import java.util.Scanner;

class Algorithm {
	static int Answer1, Answer2;
	static String strNextLine;
	static int w, x, y;
	static char[][] map;
	static String[] matchMap;
	static String[] singleMap;
	static char[] singleMatch;
	
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for(int test_case = 0; test_case < T; test_case++) {
			y = sc.nextInt();
			x = sc.nextInt();
			
			map = new char[y][x];
			singleMap = new String[y];
			
			for (int i=0; i<y; i++) {
				String strNextLine = sc.next();
				for (int j=0; j<x; j++) {
					char c = strNextLine.charAt(j);
					map[i][j] = c;
				}
			}

			w = sc.nextInt();
			matchMap = new String[w];
			
			for (int k=0; k<w; k++) {
				matchMap[k] = sc.next();
			}
			
			System.out.println("Case #"+(test_case+1));
			
			int p = 0, q = 0;
			for (int l=0; l<w; l++) {
				int length = matchMap[l].length();
				singleMatch = new char[length];
				for (int m=0; m<length; m++) {
					singleMatch[m] = matchMap[l].charAt(m);
					for (int n=0; n<y; n++) {
						for (int o=0; o<x; o++) {
							if (q >= w){
								p++;
								q=0;
							}
							if (map[n][o] == singleMatch[m]) {
								Answer1 = (n+1);
								Answer2 = (o+1);
								if (q<w){
									q++;								
								}
								break;
							}
							break;
						}
					}
				}
				
				System.out.println(Answer1 +" "+Answer2);
				Answer2 = Answer1 = 0;				
				
			}
			
			/*singleMatch = new char[w][matchMap[0].length()];
			for (int l=0; l<w; l++) {
				for (int m=0; m<matchMap[l].length(); m++){
					singleMatch[l][m] = matchMap[l].charAt(m);
				}
			}
			
			int p = 0, q = 0;
			for (int n=0; n<y; n++) {
				for (int o=0; o<x; o++) {
					if (q >= w){
						p++;
						q=0;
					}
					if (map[n][o] == singleMatch[p][q]) {
						System.out.println((n+1) +" - "+(o+1));
						if (q<w){
							q++;								
						}
					}
				}
			}*/	
		}
	}
}


/*2
5 4
qwer
asdf
zxcv
yuio
hjkl
3
zxc
yui
zuk

10 11
abcdefghijW
lmnopqrstHv
wxyzabcdifg
hKjklmnTpqr
stCvwxezabc
qweAtyqwert
qwerLyqwert
qwertBqwert
qwertyqwert
qwertyqwert
2
black
white


Case #1 :

3 1
4 1
3 1

Case #2 :

8 6
1 11
*/