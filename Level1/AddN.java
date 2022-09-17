package Level1;

public class AddN {
	public int solution(int n) {
        int answer = 0;
        
        while(n>0) {
        	answer += n%10;
        	n /= 10;
        }
        answer += n;
        return answer;
    }
	
	public static void main(String[] args) {
    	AddN sol = new AddN();
    	int n= 987;
    	System.out.println(sol.solution(n));
    }
}
