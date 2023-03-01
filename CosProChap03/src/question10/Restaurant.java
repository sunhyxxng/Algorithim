package question10;

import java.util.Iterator;

public class Restaurant extends Shop {

	public Restaurant() {
		super();
	}

	@Override
	public boolean reserve(Customer customer) {
		if (customer.numberOfPeople < 2 || customer.numberOfPeople > 8) {
			return false;
		}
		
		int count = 0;
		Iterator<Customer> iterator = reserveList.iterator();
		while (iterator.hasNext()) {
			Customer reservedCustomer = iterator.next();
			if (reservedCustomer.time == customer.time)
				count++;
		}
		
		if (count >= 2) {
			return false;
		}
		
		reserveList.add(customer);
		return true;
	}
	
}
