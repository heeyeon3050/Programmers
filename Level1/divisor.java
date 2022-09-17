package Level1;

public class divisor {
	public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n/2; i++) {
        	if(n%i==0)
        		answer += i;
        }
        answer += n;
        return answer;
    }
	
	public static void main(String[] args) {
    	divisor sol = new divisor();
    	int n = 5;
    	System.out.println(sol.solution(n));
    }
}
