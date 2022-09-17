package Level1;

public class caesar {
	public String solution(String s, int n) {
        String answer = "";
        
        char[] c = s.toCharArray();
        
        for(int i=0; i<c.length; i++) {
        	if(Character.isLowerCase(c[i])) {
        		c[i] = (char)((c[i]-'a'+n)%26+'a');
        	}
        	else if(Character.isUpperCase(c[i])) {
        		c[i] = (char)((c[i]-'A'+n)%26+'A');
        	}
        	answer += c[i];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
    	caesar sol = new caesar();
    	String s = "y";
    	int n = 4;
    	System.out.println(sol.solution(s, n));
    }
}
