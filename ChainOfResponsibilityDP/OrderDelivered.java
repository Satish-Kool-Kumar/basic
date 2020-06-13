package kool.ChainOfResponsibilityDP;

public class OrderDelivered implements Swiggy{
	private Swiggy obj;
	@Override
	public void setNextAction(Swiggy obj) {
	}
	@Override
	public void getFoodStatus(FoodOrder obj) {
		System.out.println("Food Order Recieved By Customer............"+obj.getsFoodName());
		
	}
	
}
