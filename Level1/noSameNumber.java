package Level1;

import java.util.Arrays;

public class noSameNumber {
	public int[] solution(int []arr) {
        int[] answer = {};
        int j = 0;
        int same = -1;
        int[] temp = new int[arr.length];
        
        for (int i=0; i<arr.length; i++) {
        	if(same !=arr[i]) {
        		temp[j++] = arr[i];
        		same = arr[i];
        	}
        }
        
        answer = new int[j];
        for(int i=0; i<j; i++)
        	answer[i] = temp[i];
        
        return answer;
    }
	
	public static void main(String[] args) {
    	noSameNumber sol = new noSameNumber();
    	int[] arr = {4,4,4,3,3};
    	System.out.println(Arrays.toString(sol.solution(arr)));
    }
}
