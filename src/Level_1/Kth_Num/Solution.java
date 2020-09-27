package Level_1.Kth_Num;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	
	private ArrayList<Integer> list;
	private int[] array;
	
	public Solution() {
		 list = new ArrayList<Integer>();
	}
	
	private void cutArray(int s, int e) {
		for(int k = s - 1; k < e; k++) {
			list.add(this.array[k]);
		}
	}
	
	private void ArraySort() {
		Collections.sort(list);
	}
	
	private int kthNum(int point) {
		int num = list.get(point-1);
		list.clear();
		return num;
	}
	
	public int[] solution(int[] array, int[][] commands) {
		this.array = array;
		int[] answer = new int[commands.length];
		int c = 0;
		
        for(int k = 0; k < commands.length; k++) {
        	cutArray(commands[k][0], commands[k][1]);
        	ArraySort();
        	answer[c++] = kthNum(commands[k][2]);
        }
		
        return answer;
    }
}
