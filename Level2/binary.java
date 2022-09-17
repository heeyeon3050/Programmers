package Level2;

import java.util.Arrays;

class binary {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while(s.length()>1) {
        	int cntOne = 0;
        	for(int i=0; i<s.length(); i++) {
        		if(s.charAt(i)=='0')
        			answer[1]++;
        		else
        			cntOne++;
        	}
        	s = Integer.toBinaryString(cntOne);
        	answer[0]++;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	binary sol = new binary();
    	String s = "110010101001";
    	System.out.println(Arrays.toString(sol.solution(s)));
    }
}
