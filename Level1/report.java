package Level1;
import java.util.*;

class report {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, HashSet<String>> reportedMap = new HashMap<>(); //신고된 ID, [신고한 ID]
        Map<String, Integer> answerMap = new HashMap<>(); //신고한 ID, 메일 수
        
        //초기화
        for (int i=0; i < id_list.length; i++) {
        	HashSet<String> reportingId = new HashSet<>();
        	reportedMap.put(id_list[i], reportingId);
        	answerMap.put(id_list[i], 0);
        }
        
        //reportedMap에 신고기록 세팅
        for (String s : report) {
        	String[] reportStr = s.split(" ");
        	String reportingID = reportStr[0]; //신고한 ID
        	String reportedID = reportStr[1]; //신고된 ID
        	reportedMap.get(reportedID).add(reportingID); //신고된 ID를 key값으로 신고한 ID를 세팅
        }
        
        //유저가 받은 이용 정지 결과 메일 세팅
        for (String s1 : reportedMap.keySet()) {
        	HashSet<String> reportingId = reportedMap.get(s1);
        	if (reportingId.size() >= k) {
        		for (String userId : reportingId) {
        			answerMap.put(userId, answerMap.get(userId)+1); //신고한 ID에게 메일 넣기
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
