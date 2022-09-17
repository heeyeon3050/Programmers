package Level1;

import java.util.Arrays;

class x_n {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long a = 0;
        
        for(int i=0; i<n; i++) {
        	a += x;
        	answer[i] = a;
        }
        return answer;
    }
    
    public static void main(String[] args) {
		x_n sol = new x_n();
    	int x = 2;
    	int n = 5;
    	System.out.println(Arrays.toString(sol.solution(x, n)));
    }
}