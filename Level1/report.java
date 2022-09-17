package Level1;
import java.util.*;

class report {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, HashSet<String>> reportedMap = new HashMap<>(); //�Ű�� ID, [�Ű��� ID]
        Map<String, Integer> answerMap = new HashMap<>(); //�Ű��� ID, ���� ��
        
        //�ʱ�ȭ
        for (int i=0; i < id_list.length; i++) {
        	HashSet<String> reportingId = new HashSet<>();
        	reportedMap.put(id_list[i], reportingId);
        	answerMap.put(id_list[i], 0);
        }
        
        //reportedMap�� �Ű��� ����
        for (String s : report) {
        	String[] reportStr = s.split(" ");
        	String reportingID = reportStr[0]; //�Ű��� ID
        	String reportedID = reportStr[1]; //�Ű�� ID
        	reportedMap.get(reportedID).add(reportingID); //�Ű�� ID�� key������ �Ű��� ID�� ����
        }
        
        //������ ���� �̿� ���� ��� ���� ����
        for (String s1 : reportedMap.keySet()) {
        	HashSet<String> reportingId = reportedMap.get(s1);
        	if (reportingId.size() >= k) {
        		for (String userId : reportingId) {
        			answerMap.put(userId, answerMap.get(userId)+1); //�Ű��� ID���� ���� �ֱ�
        		}
        	}
        }
        
        for(int i = 0; i < id_list.length; i++) {
        	answer[i] = answerMap.get(id_list[i]);
        }
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
        
    public static void main(String[] args) {
    	report sol = new report();
    	String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    	String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
    	int k = 2;
    	sol.solution(id_list, report, k);
    }
}
