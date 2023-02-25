package question6;

import java.util.Arrays;

public class Main {
	public int[] whereIsRobot(String commands) {
		char[] divideCommands = commands.toCharArray();
		int x = 0;
		int y = 0;
		for (int i = 0; i < divideCommands.length; i++) {
			String command = Character.toString(divideCommands[i]);
			if ("L".equals(command)) {
				x -= 1;
			} else if ("R".equals(command)) {
				x += 1;
			} else if ("U".equals(command)) {
				y += 1;
			} else if ("D".equals(command)) {
				y -= 1;
			}
		}
		int[] position = {x, y};
		return position;
	}

	public static void main(String[] args) {
		 Main sol = new Main();
	        String commands = "URDDL";
	        int[] ret = sol.whereIsRobot(commands);

	        System.out.println("commands 실행 후의 로봇의 위치는 " + Arrays.toString(ret) + " 입니다.");
	}
}
