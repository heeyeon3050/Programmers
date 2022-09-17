package Level2;

import java.util.Arrays;

class max_min {
    public String solution(String s) {
    	StringBuilder sb = new StringBuilder();
    	String arr[] = s.split(" ");
    	int number[] = new int[arr.length];
    	for(int i=0; i<arr.length; i++)
    		number[i] = Integer.parseInt(arr[i]);
    	Arrays.sort(number);
        sb.append(number[0]).append(" ").append(number[arr.length-1]);
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
    	max_min sol = new max_min();
    	String s = "-1 -2 -3 -4";
    	System.out.println(sol.solution(s));
    }
}
