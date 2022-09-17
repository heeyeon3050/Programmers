package Level1;

class hasad {
    public boolean solution(int x) {
        boolean answer = true;
        int num=0;
        
        
        int y = x;
        while(y>9) {
        	num += y%10;
        	y/=10;
        }
        num += y;
        
        if(x%num!=0)
        	answer = false;
        
        return answer;
    }
    
    public static void main(String[] args) {
		hasad sol = new hasad();
    	int num = 1999;
    	System.out.println(sol.solution(num));
    }
}