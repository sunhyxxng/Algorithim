package question9;

public class Main {
	public int func(int record) {
		if (0 == record)
			return 1;
		else if (1 == record)
			return 2;
		return 0;
	}

	public int currentPos(int[] recordA, int[] recordB) {
		int count = 0;
		for (int i = 0; i < recordA.length; i++) {
			if (recordA[i] == recordB[i]) // 비김
				continue;
			else if (recordA[i] == func(recordB[i])) // 이김
				count += 3;
			else // 졌을 때
				count = (count == 0 ? 0 : count - 1);
		}
		return count;
	}

	public static void main(String[] args) {
		Main sol = new Main();
		int[] recordA = { 2, 0, 0, 0, 0, 0, 1, 1, 0, 0 };
		int[] recordB = { 0, 0, 0, 0, 2, 2, 0, 2, 2, 2 };
		int currentPosition = sol.currentPos(recordA, recordB);

		System.out.println("가위 바위 보가 끝난 뒤 A의 위치는 " + currentPosition + "입니다.");
	}

}
