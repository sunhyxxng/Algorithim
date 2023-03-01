package question10;

import java.util.Iterator;

public class HairShop extends Shop {

	public HairShop() {
		super();
	}

	@Override
	public boolean reserve(Customer customer) {
		if (1 != customer.numberOfPeople) {
			return false;
		}
		
		Iterator<Customer> iterator = reserveList.iterator();
		while (iterator.hasNext()) {
			Customer reservedCustomer = iterator.next();
			if (reservedCustomer.time == customer.time) {
				return false;
			}
		}
		reserveList.add(customer);
		return true;
	}
}
