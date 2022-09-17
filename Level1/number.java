package Level1;

class number {
	public int solution(String s) {
        int answer = 0;
        
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        
        for(int i=0; i<10; i++)
        	s = s.replace(num[i], Integer.toString(i));
        
        answer = Integer.parseInt(s);
        
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
    	number sol = new number();
    	String s = "one4seveneight";
    	sol.solution(s);
    }
}
