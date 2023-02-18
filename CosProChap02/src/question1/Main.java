package question1;

public class Main {
	public int getTotalCost(String[] bookType, int day) {
		Book[] bookList = new Book[50];
		int length = bookType.length;

		for (int i = 0; i < length; i++) {
			if ("comic".equals(bookType[i])) {
				bookList[i] = new ComicBook();
			} else if ("novel".equals(bookType[i])) {
				bookList[i] = new Novel();
			}
		}

		int totalRentalPrice = 0;
		for (int i = 0; i < length; i++) {
			totalRentalPrice += bookList[i].getRentalPrice(day);
		}

		return totalRentalPrice;
	}

	public static void main(String[] args) {
		Main sol = new Main();
		String[] bookTypes = { "comic", "comic", "novel" };
		int day = 4;
		int ret = sol.getTotalCost(bookTypes, day);

		System.out.println("solution 메소드의 반환 값은 " + ret + "원 입니다.");
	}

}
