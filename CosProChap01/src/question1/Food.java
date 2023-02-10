package question1;

public class Food {
	public String name;
	public int price;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
