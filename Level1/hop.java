package Level1;

public class hop {
	public long solution(int a, int b) {
        long answer = 0; 
        if(a > b) {
        	for(int i=b; i<=a; i++)
        		answer += i;
        }
        else
        	for(int i=a; i<=b; i++)
        		answer += i;
        return answer;
    }
	
	public static void main(String[] args) {
    	hop sol = new hop();
    	int a = 3;
    	int b = 3;
    	System.out.println(sol.solution(a, b));
    }
}
