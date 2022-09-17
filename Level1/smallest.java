package Level1;
import java.util.ArrayList;
import java.util.Arrays;

public class smallest {
	public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]<min)
        		min = arr[i];
        }
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] != min)
        		list.add(arr[i]);
        }
        
        if(list.size() == 0) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        else {
        	answer = new int[list.size()];
        	for(int i=0; i<list.size(); i++)
        		answer[i] = list.get(i);
        }
       
        return answer;
    }
	
	public static void main(String[] args) {
		smallest sol = new smallest();
    	int[] arr = {4, 3, 2, 1};
    	System.out.println(Arrays.toString(sol.solution(arr)));
    }
}
