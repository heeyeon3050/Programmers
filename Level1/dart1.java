package Level1;

public class dart1 {
	public int solution(String dartResult) {
        int answer = 0;
        int j=0, n=0;
        int[] score = new int[3];
        String numstr = "";
        
        for(int i=0; i<dartResult.length(); i++) {
        	char c = dartResult.charAt(i);
        	if(c>='0' && c<='9')
        		numstr += String.valueOf(c);
        	else if(c=='S' || c=='D' || c=='T') {
        		n = Integer.parseInt(numstr);
        		if(c=='S')
        			score[j++] = (int)Math.pow(n, 1);
        		else if(c=='D')
        			score[j++] = (int)Math.pow(n, 2);
        		else
        			score[j++] = (int)Math.pow(n, 3);
        		numstr="";
        	}
        	else {
        		if(c=='*') {
        			score[j-1]*=2;
        			if(j-2>=0)
        				score[j-2]*=2;
        		}
        		else
        			score[j-1]*=-1;
        	}
        }
        answer = score[0] + score[1] + score[2];
        return answer;
    }
	
	public static void main(String[] args) {
    	dart1 sol = new dart1();
    	String dartResult = "1D2S#10S";
    	System.out.println(sol.solution(dartResult));
    }
}
