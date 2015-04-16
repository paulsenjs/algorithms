package cutthesticks;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static int intInput;
	static String t;
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		intInput = sc.nextInt();
		sc.nextLine();

		arr = new int[intInput];
		for (int i=0; i<intInput; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(arr.length);
		reduce(arr);
	}
	
	static int reduce(int[] data){
		Arrays.sort(data);
		int[] _data = new int[data.length];
		
		for (int a=0; a<data.length; a++) {
			_data[a] = data[a] - data[0];			
		}
		
		int j = 0;
		for (int a=0; a<_data.length; a++) {
			if (_data[a] != 0) {
				_data[j++] = _data[a];
			}
		}
		
		int[] newData = new int[j];
		System.arraycopy(_data, 0, newData, 0, j);
		if (newData.length == 0) {
			return 0;
		}
		System.out.println(newData.length);
		return reduce(newData);
	}
}
