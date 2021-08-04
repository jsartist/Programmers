package level2;

import java.util.Vector;

public class Solution {
	public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int wordCount = -1;
        int co = 1;
        Vector<String> w = new Vector<String>();
        
        w.add(words[++wordCount]);
        
        while(words.length - 1 >= co){
        	if((words[wordCount].charAt(words[wordCount].length()-1) 
        			== words[++wordCount].charAt(0))
        			&& w.indexOf(words[wordCount]) == -1)
        	{
        			w.add(words[wordCount]);
        			++co;
        		}
        		else {
        			answer[0] = co % n + 1;
        			answer[1] = co / n + 1;
        			co = 2147483647;
        		}
        }
        return answer;
	}
}
