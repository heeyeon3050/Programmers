package Test;

public class test1 {
	public String solution(String src) {
		StringBuilder sb = new StringBuilder();
		char arr[] = new char[src.length()];
		String str = "";
		int cnt = 0;
        
        for(int i=0; i<src.length(); i++) {
        	arr[i] = src.charAt(i);
        }
        
        sb.append(arr[0]);
        for(int i=1; i<src.length(); i++) {
        	if(arr[i]==arr[i-1]) {
        		cnt++;
        	}
        	else {
	        	str = Character.toString(65+cnt);
	        	sb.append(str);
	        	cnt = 0;
        	}
        }
        str = Character.toString(65+cnt);
        sb.append(str);
        
        return sb.toString();
    }
	
	public static void main(String[] args) {
		test1 sol = new test1();
    	String src = "111100100011";
    	System.out.println(sol.solution(src));
    }
}
