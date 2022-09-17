package Level1;

import java.util.Arrays;

class lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2];
        
        int zero = 0;
        int check = 0;
        
        for(int l : lottos) {
        	if (l == 0)
        		zero++;
        	else {
        		for (int w : win_nums) {
        			if(l==w) {
        				check++;
        				break;
        			}
        		}
        	}
        }
        
        answer[0] = Math.min(7-(check+zero), 6); //최고순위
        answer[1] = Math.min(7-check, 6); //최저순위
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    
    public static void main(String[] args) {
    	lotto sol = new lotto();
    	int[] lottos = {44, 1, 0, 0, 31, 25};
    	int[] win_nums = {31, 10, 45, 1, 6, 19};
    	sol.solution(lottos, win_nums);
    }
}
