package Level1;

public class findMinority {
	public int solution(int n) {
        /* 방법 1. 시간 초과, 효율성 떨어짐
		int answer = 1;
        
        for(int i=3; i<=n; i++) {
        	for(int j=2; j<i; j++) {
        		if(i%j == 0)
        			break;
        		if(j==i-1)
        			answer++;
        	}
        }
        */
		
		//에라토스테네스의 체를 활용한 소수찾기
		int answer = 0;
		boolean[] sosu = new boolean[n+1];
		
		//2~n번째 수 true로 초기화
		for(int i=2; i<=n; i++)
			sosu[i] = true;
		
		//제곱근 구하기
		int root = (int)Math.sqrt(n);
		
		for(int i=2; i<=root; i++) {
			if(sosu[i] == true) {
				for(int j=i; i*j<=n; j++)
					sosu[i*j] = false;
			}
		}
		
		//소수 개수 세기
		for(int i=2; i<=n; i++) {
			if(sosu[i] == true)
				answer++;
		}
        return answer;
    }
	
	public static void main(String[] args) {
		findMinority sol = new findMinority();
    	int n= 10;
    	System.out.println(sol.solution(n));
    }
}
