package Level1;

import java.util.Arrays;

class test1 {
    public int[] solution(int[][] v) {
        int[] answer = new int[2];

        for(int i=0; i<2; i++) {
	        if(v[0][i]==v[1][i]) 
	        	answer[i] = v[2][i];
	        else if(v[0][i]==v[2][i])
	        	answer[i] = v[1][i];
	        else
	        	answer[i] = v[0][i];
        }
        

        return answer;
    }
    
    public static void main(String[] args) {
    	test1 sol = new test1();
    	int v[][] = {{1,4},{3,4},{3,10}};
    	System.out.println(Arrays.toString(sol.solution(v)));
    }
}
