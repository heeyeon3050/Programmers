package Level2;

import java.util.LinkedList;
import java.util.Queue;

class parentheses {
    boolean solution(String s) {
        boolean answer = true;
        Queue<Character> queue = new LinkedList<>();
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i)==')') {
        		if(queue.isEmpty()) {
        			answer = false;
        			return answer;
        		}
        		else
        			queue.poll();
        	}
        	else
        		queue.add(s.charAt(i));
        }
        if(!queue.isEmpty())
        	answer = false;

        return answer;
    }
    
    public static void main(String[] args) {
    	parentheses sol = new parentheses();
    	String s = "()((";
    	System.out.println(sol.solution(s));
    }
}
