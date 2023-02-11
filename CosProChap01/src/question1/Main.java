package question1;

public class Main {

	public static void main(String[] args) {
		String[] myOrderList = {"Cheese", "Pineapple", "Hawaiian"}; // test commit & push
		int result = solution(myOrderList);
		
		System.out.println("내가 주문한 피자의 총 가격은 " + result + "입니다.");
	}
	
	public static int solution(String[] orderList) {
		DeliveryStore deliveryStore = new PizzaStore();
		deliveryStore.setOrderList(orderList);
		int totalPrice = deliveryStore.getTotalPrice();
		
		return totalPrice;
	}

}
