package Level1;
import java.util.*;

public class intDescending {
	
	public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        String[] num = str.split("");
        Arrays.sort(num, Collections.reverseOrder());
        str = "";
        for(int i=0; i<num.length; i++)
        	str += num[i];
        answer = Long.parseLong(str);
        
        return answer;
    }

	
	public static void main(String[] args) {
		intDescending sol = new intDescending();
    	long n = 118372;
    	System.out.println(sol.solution(n));
    }
}
