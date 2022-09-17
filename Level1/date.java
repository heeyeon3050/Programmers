package Level1;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class date {
	public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        answer = dayOfWeek.toString().substring(0,3);
        return answer;
    }
	
	public static void main(String[] args) {
    	date sol = new date();
    	int a = 5;
    	int b = 24;
    	System.out.println(sol.solution(a, b));
    }
}
