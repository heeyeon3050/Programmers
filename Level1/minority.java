package Level1;

public class minority {
	public int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length; i++) {
        	for (int j=i+1; j<nums.length; j++) {
        		for (int k=j+1; k<nums.length; k++) {
        			int sum = nums[i] + nums[j] + nums[k];
        			
        			if (isprime(sum))
        				answer++;
        		}
        	}
        }
        return answer;
    }
	
	public boolean isprime(int num) {
		for(int i = 2; i<num; i++) {
			if (num%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
    	minority sol = new minority();
    	int[] nums = {1,2,3,4};
    	System.out.println(sol.solution(nums));
    }
}
