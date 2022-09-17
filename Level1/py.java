package Level1;

public class py {
	boolean solution(String s) {
        boolean answer = true;
        int p_cnt = 0;
        int y_cnt = 0;
        
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
        		p_cnt++;
        	else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
        		y_cnt++;
        }
        
        if(p_cnt != y_cnt++)
        	answer=false;

        return answer;
    }
	
	public static void main(String[] args) {
    	py sol = new py();
    	String s = "pPoooyY";
    	System.out.println(sol.solution(s));
    }
}
