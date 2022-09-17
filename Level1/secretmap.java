package Level1;

import java.util.Arrays;

public class secretmap {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {
        	answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        	answer[i] = answer[i].replace('0', ' ');
        	answer[i] = answer[i].replace('1', '#');
        	
        	while(answer[i].length() < n) {
        		answer[i] = ' ' + answer[i];
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
    	secretmap sol = new secretmap();
    	int n = 5;
    	int[] arr1 = {9, 20, 28, 18, 11};
    	int[] arr2 = {30, 1, 21, 17, 28};
    	System.out.println(Arrays.toString(sol.solution(n, arr1, arr2)));
    }
}
