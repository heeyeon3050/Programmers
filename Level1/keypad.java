package Level1;

public class keypad {
	 public String solution(int[] numbers, String hand) {
	        String answer = "";
	        int left = 10, right = 12;
	        
	        for (int num : numbers) {
	        	if (num == 1 | num == 4 | num == 7) {
	        		answer+="L";
	        		left = num;
	        	}
	        	else if (num == 3 | num == 6 | num == 9) {
	        		answer+="R";
	        		right = num;
	        	}
	        	else {
	        		if(num == 0)
	        			num = 11;
	        		int distanceL = Math.abs(num-left)/3 + Math.abs(num-left)%3;
	        		int distanceR = Math.abs(num-right)/3 + Math.abs(num-right)%3;
	        		
	        		if(distanceL<distanceR) {
	        			answer+="L";
	        			left = num;
	        		}
	        		else if(distanceL>distanceR) {
	        			answer+="R";
	        			right = num;
	        		}
	        		else {
	        			if(hand.equals("left")) {
	        				answer+="L";
	        				left = num;
	        			}
	        			else {
	        				answer+="R";
	        				right = num;
	        			}
	        		}
	        	}
	        }
	        System.out.println("\"" + answer + "\"");
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
	    	keypad sol = new keypad();
	    	int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
	    	String hand = "right";
	    	sol.solution(numbers, hand);
	    }
}
