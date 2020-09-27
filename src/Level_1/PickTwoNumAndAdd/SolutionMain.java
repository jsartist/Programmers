package Level_1.PickTwoNumAndAdd;

public class SolutionMain {
	public static void main(String[] args) {
		int[] num = {2, 1, 3, 4};
		int[] answer = new Solution().solution(num);
		
		for(int k = 0; k < answer.length; k++) {
			System.out.println(answer[k]);
		}
		
	}
}