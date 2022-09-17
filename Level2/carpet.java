package Level2;

import java.util.Arrays;

public class carpet {
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int i=1; i<=yellow; i++) {
        	if(yellow%i==0) {
        		int row = yellow/i;
        		int col = i;
        		if((row+col)*2+4 == brown) {
        			answer[0] = row+2;
        			answer[1] = col+2;
        			break;
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		carpet sol = new carpet();
    	int brown = 10;
    	int yellow = 2;
    	System.out.println(Arrays.toString(sol.solution(brown, yellow)));
    }
}
