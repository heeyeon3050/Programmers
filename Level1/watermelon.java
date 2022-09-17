package Level1;

public class watermelon {
	public String solution(int n) {
        String answer = "";
        
        for(int i=0; i<n; i++) {
        	if(i%2 == 0)
        		answer += "¼ö";
        	else
        		answer += "¹Ú";
        }
        return answer;
    }
	
	public static void main(String[] args) {
    	watermelon sol = new watermelon();
    	int n = 4;
    	System.out.println(sol.solution(n));
    }
}
