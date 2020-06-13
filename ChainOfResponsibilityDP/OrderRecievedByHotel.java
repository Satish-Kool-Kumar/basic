package kool.ChainOfResponsibilityDP;

public class OrderRecievedByHotel implements Swiggy{
	private Swiggy obj;
	@Override
	public void setNextAction(Swiggy obj) {	
		this.obj = obj;
	}
	@Override
	public void getFoodStatus(FoodOrder obj) {
		System.out.println("Food Order Recieved............");
		
	}
	
}
