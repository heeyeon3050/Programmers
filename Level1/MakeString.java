package Level1;

import java.util.Arrays;

public class MakeString {
	public int[] solution(long n) {
		String str = ""+n; // ��Ʈ�� + int �� ��� ��Ʈ������ �ν�
		int number = str.length();
		int[] answer = new int[number];	
		for(int index=0; index<number;index++) {	
			answer[index] = (int)(n%10);       
			n/=10;		
			}    
		return answer; 
		}
	
	
	public static void main(String[] args) {
		MakeString sol = new MakeString();
    	long n = 12345;
    	System.out.println(Arrays.toString(sol.solution(n)));
    }
}
