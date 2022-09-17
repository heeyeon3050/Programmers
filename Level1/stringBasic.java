package Level1;

public class stringBasic {
	public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()!=4 && s.length()!=6)
        	return false;
        
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i)<'0' || s.charAt(i)>'9') {
        		return false;
        	}	
        }
        return answer;
    }
	
	public static void main(String[] args) {
    	stringBasic sol = new stringBasic();
    	String s = "a234";
    	System.out.println(sol.solution(s));
    }
}
