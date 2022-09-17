package Level1;

public class rest1 {
	public int solution(int n) {
        int answer = 0;
        int i=2;
        
        while(true) {
        	if(n%i == 1)
        		break;
        	i++;
        }
        answer = i;
        return answer;
    }
	
	public static void main(String[] args) {
    	rest1 sol = new rest1();
    	int n = 10;
    	System.out.println(sol.solution(n));
    }
}
