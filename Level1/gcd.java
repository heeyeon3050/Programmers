package Level1;

import java.util.Arrays;

public class gcd {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        
        while(b != 0) {
        	int r = a%b;
        	a = b;
        	b = r;
        }
        
        answer[0] = a;
        answer[1] = (n*m)/a;
        
        return answer;
    }
	
	public static void main(String[] args) {
		gcd sol = new gcd();
    	int n = 2;
    	int m = 5;
    	System.out.println(Arrays.toString(sol.solution(n, m)));
    }
}
