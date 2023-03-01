package question10;

import java.util.ArrayList;

public class Shop {
	protected ArrayList<Customer> reserveList;

	public Shop() {
		this.reserveList = new ArrayList<Customer>();
	}
	
	public boolean reserve(Customer customer) {
		reserveList.add(customer);
		return true;
	}
}
