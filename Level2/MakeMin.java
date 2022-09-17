package Level2;

import java.util.Arrays;

class MakeMin
{
    public int solution(int []A, int []B)
    {
    	Arrays.sort(A);
    	Arrays.sort(B);
    	int answer = 0;
    	for(int i=0; i<A.length; i++) {
    		answer += A[i]*B[B.length-1-i];
    	}

        return answer;
    }
    
    public static void main(String[] args) {
    	MakeMin sol = new MakeMin();
    	int[] A = {1, 4, 2};
    	int[] B = {5, 4, 4};
    	System.out.println(sol.solution(A, B));
    }
}
