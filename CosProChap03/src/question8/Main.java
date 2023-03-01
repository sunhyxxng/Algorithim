package question8;

public class Main {
	public int getNumberOfFansToBuy(int k, int[] students) {
		int fansCount = 0;
		for (int i = 0; i < students.length; i++) {
			students[i] -= 4 * k;
			if (students[i] <= 0) {
				continue;
			}
			fansCount += (students[i] + k - 1) / k;
		}
		return fansCount;
	}

	public static void main(String[] args) {
		Main sol = new Main();
		int k1 = 1;
		int[] student1 = { 4, 4, 4, 4 };
		int ret1 = sol.getNumberOfFansToBuy(k1, student1);

		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int k2 = 3;
		int[] student2 = { 15, 17, 19, 10, 23 };
		int ret2 = sol.getNumberOfFansToBuy(k2, student2);

		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

	}

}
