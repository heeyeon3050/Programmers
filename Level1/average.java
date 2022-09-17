package Level1;

public class average {
	public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        
        for(int i=0; i<arr.length; i++) {
        	sum += arr[i];
        }
        answer = sum/arr.length;
        return answer;
    }
	
	public static void main(String[] args) {
		average sol = new average();
    	int[] arr = {1, 2, 3, 4};
    	System.out.println(sol.solution(arr));
    }
}
