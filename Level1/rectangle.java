package Level1;

public class rectangle {
	public int solution(int[][] sizes) {
        int answer = 0;
        int max_garo = 0;
        int max_sero = 0;
        
        for (int i=0; i<sizes.length; i++) {
        	//명함의 긴부분을 가로로 눕히기
        	int garo = Math.max(sizes[i][0], sizes[i][1]);
        	int sero = Math.min(sizes[i][0], sizes[i][1]);
        	max_garo = Math.max(max_garo, garo);
        	max_sero = Math.max(max_sero, sero);
        }
        
        answer = max_garo*max_sero;
        return answer;
    }
	
	public static void main(String[] args) {
    	rectangle sol = new rectangle();
    	int[][] sizes = {{60, 50},{30, 70}, {60, 30}, {80, 40}};
    	System.out.println(sol.solution(sizes));
    }
}
