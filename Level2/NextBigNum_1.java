package Level2;

public class NextBigNum_1 {
	public int solution(int n) {
        int answer = n;
        int cnt_a = 0;
        int cnt_b = 0;
        
        cnt_a = Integer.bitCount(n);
        
        while(true) {
        	answer++;
        	cnt_b = Integer.bitCount(answer);
        	if(cnt_a == cnt_b)
        		break;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		NextBigNum_1 sol = new NextBigNum_1();
    	int n = 15;
    	System.out.println(sol.solution(n));
    }
}