package Level1;

public class cost {
	public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        
        for(int i=1; i<=count; i++) {
        	sum += price*i;
        }
        
        if(sum > money)
        	answer = sum - money;

        return answer;
    }
	
	public static void main(String[] args) {
    	cost sol = new cost();
    	int price = 3;
    	int money = 20;
    	int count = 4;
    	System.out.println(sol.solution(price, money, count));
    }
}
