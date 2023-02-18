package question1;

public class ComicBook implements Book {

	@Override
	public int getRentalPrice(int day) {
		int cost = 500;
		day -= 2;
		if (day > 0) {
			cost += (day * 200);
		}
		return cost;
	}

}
