package Level1;

public class inner {
	public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i=0; i<a.length; i++) {
        	answer+=a[i]*b[i];
        }
        return answer;
    }
	
	public static void main(String[] args) {
    	inner sol = new inner();
    	int[] a = {1,2,3,4};
    	int[] b = {-3,-1,0,2};
    	System.out.println(sol.solution(a, b));
    }
}
