package Level1;

class id {
    public String solution(String new_id) {
        String answer = "";
        
        //1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
        answer = new_id.toLowerCase();
        
        //2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        //3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
        answer = answer.replaceAll("[.]{2,}",".");
        
        //4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
        answer = answer.replaceAll("^[.]|[.]$","");
        
        //5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
        if (answer.isEmpty())
        	answer = "a";
        
        //6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
             //���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
        if (answer.length() >= 16) {
        	answer = answer.substring(0,15).replaceAll("[.]$", "");
        }
        
        //7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
        while(answer.length() < 3) {
        	answer += answer.charAt(answer.length()-1);
        }
        
        System.out.println("\"" + answer + "\"");
        
        return answer;
    }
    
    public static void main(String[] args) {
    	id sol = new id();
    	String new_id = "z-+.^.";
    	sol.solution(new_id);
    }
}