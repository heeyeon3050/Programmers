package Level1;
import java.util.*;

public class descendingOrder {
	public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        
        answer = new StringBuilder(new String(charArr)).reverse().toString();
        
        return answer;
    }
	
	public static void main(String[] args) {
    	descendingOrder sol = new descendingOrder();
    	String s = "Zbcdefg";
    	System.out.println(sol.solution(s));
    }
}
