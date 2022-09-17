package Level1;

public class EvenOdd {
	public String solution(int num) {
        String answer = "";
        
        if(num%2 == 0)
        	answer = "Even";
        else
        	answer = "Odd";
        
        return answer;
    }
	
	public static void main(String[] args) {
		EvenOdd sol = new EvenOdd();
    	int num = 3;
    	System.out.println(sol.solution(num));
    }
}
