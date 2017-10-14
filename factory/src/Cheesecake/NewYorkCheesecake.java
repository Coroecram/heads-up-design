package Cheesecake;

import IngredientFactory.CheesecakeIngredientFactory;

public class NewYorkCheesecake extends Cheesecake {

	public NewYorkCheesecake(CheesecakeIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void gather() throws InterruptedException {
		System.out.println("Gathering ingredients...");
		Thread.sleep(1000);
		crust    = ingredientFactory.createCrust();
		cheese   = ingredientFactory.createCheese();
		topping  = ingredientFactory.createTopping();
		filling  = ingredientFactory.createFilling();
	}
	
	@Override
	public String toString() {
		return "New York cheesecake";
	}

}
