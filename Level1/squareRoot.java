package Level1;
import java.util.*;

public class squareRoot {
	public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        
        if(sqrt == (int)sqrt) {
        	answer = (long)Math.pow(sqrt+1, 2);
        }
        else
        	answer = -1;
        return answer;
    }
	
	public static void main(String[] args) {
    	squareRoot sol = new squareRoot();
    	int n = 121;
    	System.out.println(sol.solution(n));
    }
}
