package coby.charactermining;

import java.util.Scanner;

class Algorithm {
	static int Answer;
	static String strNextLine;
	static int w, x, y;
	static char[][] map;
	static String[] matchMap;
	static String[] singleMap;
	static char[] singleMatch;
	
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		y = sc.nextInt();
		x = sc.nextInt();
		
		for(int test_case = 0; test_case < T; test_case++) {
			
			map = new char[y][x];
			singleMap = new String[y];
			
			for (int i=0; i<y; i++) {
				String strNextLine = sc.next();
				for (int j=0; j<x; j++) {
					char c = strNextLine.charAt(j);
					map[i][j] = c;
				}
			}

			System.out.println(map);
			
			w = sc.nextInt();
			matchMap = new String[w];
			
			for (int k=0; k<w; k++) {
				matchMap[k] = sc.next();
			}
			
			System.out.println(matchMap);
			
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
								System.out.println((n+1) +" - "+(o+1));
								if (q<w){
									q++;								
								}
							}
						}
					}
					
				}
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
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			Answer = 0;
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