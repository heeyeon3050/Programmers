package Level1;

public class findMinority {
	public int solution(int n) {
        /* ��� 1. �ð� �ʰ�, ȿ���� ������
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
		
		//�����佺�׳׽��� ü�� Ȱ���� �Ҽ�ã��
		int answer = 0;
		boolean[] sosu = new boolean[n+1];
		
		//2~n��° �� true�� �ʱ�ȭ
		for(int i=2; i<=n; i++)
			sosu[i] = true;
		
		//������ ���ϱ�
		int root = (int)Math.sqrt(n);
		
		for(int i=2; i<=root; i++) {
			if(sosu[i] == true) {
				for(int j=i; i*j<=n; j++)
					sosu[i*j] = false;
			}
		}
		
		//�Ҽ� ���� ����
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
