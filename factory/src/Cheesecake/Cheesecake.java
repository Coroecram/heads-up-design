package Cheesecake;

import Ingredient.Cheese;
import Ingredient.Crust;
import Ingredient.Filling;
import Ingredient.Topping;
import IngredientFactory.CheesecakeIngredientFactory;

public abstract class Cheesecake {

	String name;
	
	Crust crust;
	Cheese cheese;
	Topping topping;
	Filling filling;
	CheesecakeIngredientFactory ingredientFactory;
	
	public abstract void gather() throws InterruptedException;
	
	public void prepare() throws InterruptedException {
		System.out.println("Preparing the " + crust + " crust and adding the " + cheese + " to the dish.");
		Thread.sleep(1000);
		System.out.println("Adding the " + filling + " into the cheescake.");
		Thread.sleep(1000);
	}
	
	public void bake() throws InterruptedException {
		System.out.println("Baking the " + this + " for 25 minutes at 350.");
		Thread.sleep(1000);
	}
	
	public void cool() throws InterruptedException {
		System.out.println("Letting the cheesecake for cool for an hour...");
		Thread.sleep(1000);
	}
	
	public void top() throws InterruptedException {
		System.out.println("Putting the " + topping + " on the cheesecake.");
		Thread.sleep(1000);
	}
	
	public void slice() throws InterruptedException {
		System.out.println("Cutting the cake into 8 slices.");
		Thread.sleep(1000);
	}
	
	public void box() throws InterruptedException {
		System.out.println("Placing cheesecake in elegant cheesecake box.");
		Thread.sleep(1000);
	}
}
