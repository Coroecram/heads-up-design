package IngredientFactory;

import Ingredient.*;

public interface CheesecakeIngredientFactory {

	public Cheese createCheese();
	public Filling createFilling();
	public Topping createTopping();
	public Crust createCrust();
}
