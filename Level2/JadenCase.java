package Level2;

class JadenCase {
    public String solution(String s) {
        String answer = "";
        String arr[] = new String[s.length()];
        arr = s.toLowerCase().split("");
      
        for(int i=0; i<arr.length; i++) {
        	if(i == 0)
        		arr[i] = arr[i].toUpperCase();
        	else {
	        	if(arr[i-1].equals(" ")) {
	        		arr[i] = arr[i].toUpperCase();
	        	}
        	}
        	answer += arr[i];
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	JadenCase sol = new JadenCase();
    	String s = "3people unFollowed me";
    	System.out.println(sol.solution(s));
    }
}
