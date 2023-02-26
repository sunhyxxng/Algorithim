package question5;

public class Main {
	public static int PRINT_COUNT = 14;
	public String printBillBoard(String phrases, int second) {
		String answer = "";
		String tmpAnswer = "______________";
		int nmg = second % 28;
		if (nmg <= PRINT_COUNT) {
			answer = tmpAnswer.substring(0, PRINT_COUNT - nmg) + phrases.substring(0, nmg);
		} else {
			answer = phrases.substring(nmg - PRINT_COUNT) + tmpAnswer.substring(0, PRINT_COUNT - (nmg - PRINT_COUNT));
		}
		return answer;
	}

	public static void main(String[] args) {
		Main sol = new Main();
        String phrases = new String("happy-birthday");
        int second = 3;
        String ret = sol.printBillBoard(phrases, second);
        
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");

	}

}
