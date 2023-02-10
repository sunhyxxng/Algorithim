package question1;

import java.util.ArrayList;
import java.util.Iterator;

public class PizzaStore implements DeliveryStore {
	private ArrayList<Food> menuList;
	private ArrayList<String> orderList;
	
	public PizzaStore() {
		menuList = new ArrayList<Food>();
		String[] menuNames = {"Cheese", "Potato", "Shrimp", "Pineapple", "Hawaiian"};
		int[] menuPrices = {11100, 12600, 13300, 21000, 19500};
		
		for (int i = 0; i < menuNames.length; i++) {
			menuList.add(new Food(menuNames[i], menuPrices[i]));
		}
		orderList = new ArrayList<String>();
	}

	@Override
	public void setOrderList(String[] orderList) {
		for (String orderItem : orderList) {
			this.orderList.add(orderItem);
		}	
	}

	@Override
	public int getTotalPrice() {
		int totalPrice = 0;
		Iterator<String> iterator = orderList.iterator();
		while (iterator.hasNext()) {
			String order = iterator.next();
			for (Food menuItem : menuList) {
				if (order.equals(menuItem.getName())) {
					totalPrice += menuItem.getPrice();
				}
			}
		}
		return totalPrice;
	}

}
