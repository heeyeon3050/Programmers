package Level2;

class Fibonacci {
    public int solution(int n) {
        int answer = 0;
        int f[] = new int[n+1];
        int sum = 0;
        f[0] = 0;
        f[1] = 1;
        
        for(int i=2; i<=n; i++) {
        	sum = f[i-1] + f[i-2];
        	f[i] = sum % 1234567;
        }
        answer = f[n];
        return answer;
    }
    
    public static void main(String[] args) {
    	Fibonacci sol = new Fibonacci();
    	int n = 5;
    	System.out.println(sol.solution(n));
    }
}
