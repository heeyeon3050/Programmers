package Level2;

public class NextBigNum {
	public int solution(int n) {
        int answer = n;
        int cnt_a = 0;
        int cnt_b = 0;
        
        String a = Integer.toBinaryString(n);
        for(int i=0; i<a.length(); i++) {
        	if(a.charAt(i)=='1')
        		cnt_a++;
        }
        
        while(true) {
        	answer++;
        	cnt_b=0;
        	String b = Integer.toBinaryString(answer);
        	for(int i=0; i<b.length(); i++) {
        		if(b.charAt(i)=='1')
        			cnt_b++;
        	}
        	if(cnt_a == cnt_b)
        		break;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		NextBigNum sol = new NextBigNum();
    	int n = 15;
    	System.out.println(sol.solution(n));
    }
}
