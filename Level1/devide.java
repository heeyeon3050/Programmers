package Level1;

import java.util.Arrays;

public class devide {
	public int[] solution(int[] arr, int divisor) {
        int i = 0;
        int cnt = 0;
        
        for(int n : arr) {
        	if(n%divisor == 0)
        		cnt++;
        }
        
        if(cnt==0) {
        	int[] answer = {-1};
        	return answer;
        }
        
        int[] answer = new int[cnt];
        for(int n : arr) {
        	if(n%divisor == 0)
        		answer[i++] = n;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
    	devide sol = new devide();
    	int divisor = 1;
    	int[] arr = {2, 36, 1, 3};
    	System.out.println(Arrays.toString(sol.solution(arr, divisor)));
    }
}
