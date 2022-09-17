package Level1;

public class StringToInt {
	public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
	
	public static void main(String[] args) {
		StringToInt sol = new StringToInt();
    	String s = "1234";
    	System.out.println(sol.solution(s));
    }
}
