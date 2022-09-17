package Level1;
import java.util.*;

public class StringSort {
	public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        ArrayList<String> array = new ArrayList<String>();
        
        for(int i=0; i<strings.length; i++)
        	array.add(strings[i].charAt(n) + strings[i]);
        
        Collections.sort(array);
        
        for (int i =0; i<array.size(); i++)
        	answer[i] = array.get(i).substring(1);
        
        return answer;
	}
	
	public static void main(String[] args) {
    	StringSort sol = new StringSort();
    	int n = 1;
    	String[] strings = {"sun", "bed", "car"};
    	System.out.println(Arrays.toString(sol.solution(strings, n)));
    }
}
