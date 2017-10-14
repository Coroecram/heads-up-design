package IngredientFactory;

import Ingredient.BrieCreamCheese;
import Ingredient.Cheese;
import Ingredient.FreshRaspberries;
import Ingredient.GrahamCrackerCrust;
import Ingredient.PieDough;
import Ingredient.RaspberrySyrup;
import Ingredient.ThickCreamCheese;
import Ingredient.StrawberryTopping;
import Ingredient.Crust;
import Ingredient.FreshStrawberry;
import Ingredient.Filling;
import Ingredient.Topping;

public class FrenchCheesecakeIngredientFactory implements
		CheesecakeIngredientFactory {

	@Override
	public Cheese createCheese() {
		return new BrieCreamCheese();
	}

	@Override
	public Filling createFilling() {
		return new RaspberrySyrup();
	}

	@Override
	public Topping createTopping() {
		return new FreshRaspberries();
	}

	@Override
	public Crust createCrust() {
		return new PieDough();
	}

}
