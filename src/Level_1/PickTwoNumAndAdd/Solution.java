package Level_1.PickTwoNumAndAdd;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	private ArrayList<Integer> Add(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int k = 0; k < numbers.length - 1; k++) {
			for(int j = k + 1; j < numbers.length; j++) {
				if(!(list.contains(numbers[k] + numbers[j]))) {
					list.add(numbers[k] + numbers[j]);
				}
			}
		}
		return list;
	}
	
	private int[] Sorting(ArrayList<Integer> list) {
		int c = 0;
		int[] answer = new int[list.size()];
		Collections.sort(list);
		for(int k : list) {
			answer[c++] = k;
		}
		return answer;
	}
	
	public int[] solution(int[] numbers) {
		ArrayList<Integer> list = Add(numbers);
		return Sorting(list);
	}	
}
