package Level1;

public class Kim {
	public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		answer = "�輭���� " + i + "�� �ִ�";
        		break;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
    	Kim sol = new Kim();
    	String[] seoul = {"Jane", "Kim"};
    	System.out.println(sol.solution(seoul));
    }
}
