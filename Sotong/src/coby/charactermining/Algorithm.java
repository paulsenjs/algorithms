package coby.charactermining;

import java.util.Scanner;
import java.util.Stack;

class Algorithm {
	static Stack<Integer> stX;
	static Stack<Integer> stY;
	static Stack<Integer> stZ;
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for(int test_case = 0; test_case < T; test_case++) {
			int var = sc.nextInt();
			stX = new Stack<>();
			stY = new Stack<>();
			stZ = new Stack<>();
			
			for (int j=0; j<var; j++) {
				int child = sc.nextInt();
				int parent = sc.nextInt();
				
				if (stX.isEmpty() && stY.isEmpty()) {
					stX.push(parent);
					stY.push(child);
				}else {
					if (child == stY.peek()) {
						if (parent != stX.peek()){
							stX.push(child);
						}
					} else if (child != stY.peek()) {
						if (parent == stX.peek()) {
							stY.push(child);
						}else if (parent == stY.peek()) {
							stY.pop();
							stY.push(parent);
							stZ.push(child);
						}else if (child == stX.peek()){
							stX.pop();
							stX.push(parent);
							stZ.addAll(stY);
							stY.clear();
							stY.push(child);
						}
					}
				}
			}
			
			System.out.println("Case"+(test_case+1)+"# :");
			System.out.println("Eldest "+print(stX));
			System.out.println("SameGen "+print(stY));
			System.out.println("Younglings "+print(stZ));
		}
	}
	
	private static String print(Stack<Integer> st){
		StringBuilder str = new StringBuilder();
		if (st.size() == 0) {
			str.append("none");
		}else if ((st.size() == 1) && (st.get(0) == 0)) {
			str.append("none");
		}else {
			for (int i=0; i<st.size(); i++) {
				if (st.get(i) != 0){
					str.append(st.get(i)+" ");
				}
			}			
		}
		return ": "+str.toString();
	}
}


/*Input
2
5
1 0
4 0
0 2
3 2
5 3
1
0 1

Output
Case #1 :
Eldest     : 2
SameGen    : 3
Younglings : 1 4 5
Case #2 :
Eldest     : 1
SameGen    : none
Younglings : none
*/
	