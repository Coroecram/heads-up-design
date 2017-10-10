package Cheesecake;

import Ingredient.Cream;
import Ingredient.Crust;
import Ingredient.Filling;
import Ingredient.Topping;
import IngredientFactory.CheesecakeIngredientFactory;

public class PineappleCheesecake extends Cheesecake {

	public PineappleCheesecake(CheesecakeIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		crust   = ingredientFactory.createCrust();
		cream   = ingredientFactory.createCream();
		topping = ingredientFactory.createTopping();
		filling = ingredientFactory.createFilling();
	}

}
