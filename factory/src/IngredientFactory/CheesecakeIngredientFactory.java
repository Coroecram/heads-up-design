package IngredientFactory;

import Ingredient.*;

public interface CheesecakeIngredientFactory {

	public Cream createCream();
	public Filling createFilling();
	public Topping createTopping();
	public Crust createCrust();
}
