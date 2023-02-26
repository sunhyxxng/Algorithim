package question4;

public class Main {
	public int combineDuplicateString(String s1, String s2) {
		int answer = 0;
		int length = Math.min(s1.length(), s2.length());
		int index = 0;
		for (int i = 0; i < length; i++) {
			String tmp1 = s1.substring(s1.length() - i - 1, s1.length() - 1);
			String tmp2 = s2.substring(0, i);
			if (tmp1.equals(tmp2))
				index = i;
		}

		answer = s1.concat(s2.substring(index, s2.length() - 1)).length();
		return answer;
	}

	public static void main(String[] args) {
		Main sol = new Main();
		String s1 = new String("ababc");
		String s2 = new String("abcdab");
		int ret = sol.combineDuplicateString(s1, s2);

		System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");

	}

}
