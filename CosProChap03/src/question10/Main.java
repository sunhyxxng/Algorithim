package question10;


public class Main {
	public int getReservationCount(int[][] customers, String[] shops) {
		Shop hairShop = new HairShop();
		Shop restaurant = new Restaurant();
		int count = 0;
		for (int i = 0; i < shops.length; i++) {
			if ("hairshop".equals(shops[i])) {
				if (hairShop.reserve(new Customer(customers[i][0], customers[i][1], customers[i][2]))) 
					count++;
			} else if ("restaurant".equals(shops[i])) {
				if (restaurant.reserve(new Customer(customers[i][0], customers[i][1], customers[i][2])))
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Main sol = new Main();
        int[][] customers = {{1000, 2, 1},{2000, 2, 4},{1234, 5, 1},{4321, 2, 1}, {1111, 3, 10}};
        String[] shops = {"hairshop", "restaurant", "hairshop", "hairshop", "restaurant"};
        int ret = sol.getReservationCount(customers, shops);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}

}
