package Level_2.TriangleSnail;

public class Solution {
	private int[][] tr;
	private int jumpX = 0;
	private int jumpY = 0;
	private int savePoint = 0;
	private int num;
	private int count;
	
	public Solution() {
		this.num = 0;
		this.count = 1;
	}
	
	private void setValue(int n) {
		this.num = n;
    	
		for(int k = 2; k <= this.num; k++) {
			this.count = this.count + k;
		}
		
		tr = new int[this.num][this.num];
	}
	
	private void drawTriangle(int endNum) {
		if(endNum == 1) {
			tr[this.jumpY][this.jumpX] = ++savePoint;
		} 

		else {
			for(int k = 0; k < endNum - 1; k++) {
				tr[k + this.jumpY][this.jumpX] = ++savePoint;
			}
			for(int i = 0; i < endNum - 1; i++) {
				tr[endNum - 1 + this.jumpY][i+this.jumpX] = ++savePoint;
			}
			for(int j = endNum - 1; j >= 1; j--) {
				tr[j + this.jumpY][j + this.jumpX] = ++savePoint;
			}
		}
	}
	
	private void insertDrawTriangle() {
		for(int k = this.num; k > 0; k = k - 3) {
			drawTriangle(k);
			this.jumpX = this.jumpX + 1;
			this.jumpY = this.jumpY + 2;
		}
	}
	
	private int[] makeAnswer() {
		int[] answer = new int[count];
		int f = 0;

		for(int k = 0; k < num; k++) {
			for(int j = 0; j < num; j++) {
				if(tr[k][j] != 0) {
					answer[f++] = tr[k][j];
				}
			}
		}
		return answer;
	}
	
    public int[] solution(int n) {
    	setValue(n);
    	insertDrawTriangle();
    	
        return makeAnswer();
    }
}
