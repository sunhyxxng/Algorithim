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
			if (recordA[i] == recordB[i]) // ���
				continue;
			else if (recordA[i] == func(recordB[i])) // �̱�
				count += 3;
			else // ���� ��
				count = (count == 0 ? 0 : count - 1);
		}
		return count;
	}

	public static void main(String[] args) {
		Main sol = new Main();
		int[] recordA = { 2, 0, 0, 0, 0, 0, 1, 1, 0, 0 };
		int[] recordB = { 0, 0, 0, 0, 2, 2, 0, 2, 2, 2 };
		int currentPosition = sol.currentPos(recordA, recordB);

		System.out.println("���� ���� ���� ���� �� A�� ��ġ�� " + currentPosition + "�Դϴ�.");
	}

}
