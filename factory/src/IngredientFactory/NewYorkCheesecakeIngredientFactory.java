package IngredientFactory;

import Ingredient.Cheese;
import Ingredient.GrahamCrackerCrust;
import Ingredient.ThickCreamCheese;
import Ingredient.StrawberryTopping;
import Ingredient.Crust;
import Ingredient.FreshStrawberry;
import Ingredient.Filling;
import Ingredient.Topping;

public class NewYorkCheesecakeIngredientFactory implements
		CheesecakeIngredientFactory {

	@Override
	public Cheese createCheese() {
		return new ThickCreamCheese();
	}

	@Override
	public Filling createFilling() {
		return new FreshStrawberry();
	}

	@Override
	public Topping createTopping() {
		return new StrawberryTopping();
	}

	@Override
	public Crust createCrust() {
		return new GrahamCrackerCrust();
	}

}
