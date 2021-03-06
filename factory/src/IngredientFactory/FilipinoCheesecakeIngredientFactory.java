package IngredientFactory;

import Ingredient.Cheese;
import Ingredient.ChiffonCottageCheese;
import Ingredient.CoconutFrosting;
import Ingredient.Crust;
import Ingredient.DicedPineapple;
import Ingredient.Filling;
import Ingredient.Topping;

public class FilipinoCheesecakeIngredientFactory implements
		CheesecakeIngredientFactory {

	@Override
	public Cheese createCheese() {
		return new ChiffonCottageCheese();
	}

	@Override
	public Filling createFilling() {
		return new DicedPineapple();
	}

	@Override
	public Topping createTopping() {
		return new CoconutFrosting();
	}

	@Override
	public Crust createCrust() {
		return null;
	}

}
