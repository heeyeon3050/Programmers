package Level2;

public class NumberExpression {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n/2; i++) {
        	int num = 0;
	        for(int j=i; j<=n; j++) {
	        	num += j;
	        	if(num==n) {
	        		answer++;
	        		break;
	        	}
	        	if(num>n)
	        		break;
	        }
        }
        return answer+1;
    }
	
    public static void main(String[] args) {
    	NumberExpression sol = new NumberExpression();
    	int n = 15;
    	System.out.println(sol.solution(n));
    }
}
