package Level1;

public class center {
	public String solution(String s) {
        String answer = "";
        if(s.length()%2 == 0) {
        	answer = s.substring(s.length()/2-1, s.length()/2+1);
        }
        else
        	answer = String.valueOf(s.charAt(s.length()/2));
        
        //answer = s.substring((s.length()-1)/2, s.length()/2+1);
       
        return answer;
    }
	
	public static void main(String[] args) {
    	center sol = new center();
    	String s = "abcde";
    	System.out.println(sol.solution(s));
    }
}
