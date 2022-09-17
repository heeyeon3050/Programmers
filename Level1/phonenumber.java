package Level1;

public class phonenumber {
	public String solution(String phone_number) {
        String answer = "";
        String[] str = phone_number.split("");
        for(int i= 0; i<str.length-4; i++) {
        	str[i] = "*";
        }
        
        for(int i=0; i<str.length; i++)
        	answer += str[i];
        
        return answer;
    }
	
	public static void main(String[] args) {
		phonenumber sol = new phonenumber();
    	String phone_number = "027778888";
    	System.out.println(sol.solution(phone_number));
    }
}
