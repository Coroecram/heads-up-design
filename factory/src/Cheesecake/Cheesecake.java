package Cheesecake;

import Ingredient.Cream;
import Ingredient.Crust;
import Ingredient.Filling;
import Ingredient.Topping;
import IngredientFactory.CheesecakeIngredientFactory;

public abstract class Cheesecake {

	String name;
	
	Crust crust;
	Cream cream;
	Topping topping;
	Filling filling;
	CheesecakeIngredientFactory ingredientFactory;
		
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350.");
	}
	
	public void top() {
		System.out.println("Putting the " + topping + " on the cheesecake");
	}
	
	public void slice() {
		System.out.println("Cutting the cake into 8 slices.");
	}
	
	public void box() {
		System.out.println("Place Cheesecake in elegant Cheesecake box.");
	}
}
