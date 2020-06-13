package kool.ChainOfResponsibilityDP;

public class MainCRDP {
	private Swiggy obj1;
	
	public MainCRDP() {
		this.obj1 = new OrderRecievedByHotel();
		Swiggy obj2 = new RecievedByDeliveryBoy();
		Swiggy obj3 = new OrderDelivered();
		obj1.setNextAction(obj2);
		obj2.setNextAction(obj3);
		
	}

	public static void main(String[] args) {
		FoodOrder obj = new FoodOrder();
		obj.setsFoodName("PASTA");
		MainCRDP obj1 = new MainCRDP();
		obj1.obj1.getFoodStatus(obj);
	}

}
