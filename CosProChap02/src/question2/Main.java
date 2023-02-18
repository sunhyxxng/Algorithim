package question2;

public class Main {
	public int changeToMinutes(String times) {
		String[] timeArray = times.split(":");
		int hour = Integer.parseInt(timeArray[0]);
		int minutes = Integer.parseInt(timeArray[1]);

		return hour * 60 + minutes;
	}

	public int calculateMinTime(String[] subwayTimes, String currentTime) {
		int currentMinute = changeToMinutes(currentTime);
		int max = 999999999;
		int minimumTime = max;
		for (int i = 0; i < subwayTimes.length; i++) {
			int subwayMinute = changeToMinutes(subwayTimes[i]);
			if (currentMinute <= subwayMinute) {
				minimumTime = subwayMinute - currentMinute;
				break;
			}
		}

		if (minimumTime == max)
			return -1;

		return minimumTime;
	}

	public static void main(String[] args) {
		Main sol = new Main();
		String[] subwayTimes1 = { "05:31", "11:59", "13:30", "23:32" };
		String currentTime1 = "12:00";
		int ret1 = sol.calculateMinTime(subwayTimes1, currentTime1);

		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		String[] subwayTimes2 = { "14:31", "15:31" };
		String currentTime2 = "15:31";
		int ret2 = sol.calculateMinTime(subwayTimes2, currentTime2);

		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}

}
