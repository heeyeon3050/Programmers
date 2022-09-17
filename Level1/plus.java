package Level1;

public class plus {
	public int solution(int[] numbers) {
        int answer = 45;
        for(int num : numbers) {
        	answer -= num;
        }
        return answer;
    }
	
	public static void main(String[] args) {
    	plus sol = new plus();
    	int[] numbers = {1,2,3,4,6,7,8,0}; 
    	System.out.println(sol.solution(numbers));
    }
}
