package CheesecakeStore;

import Cheesecake.Cheesecake;
import Cheesecake.PineappleCheesecake;
import IngredientFactory.CheesecakeIngredientFactory;
import IngredientFactory.FilipinoCheesecakeIngredientFactory;

public class FilipinoCheesecakeStore extends CheesecakeStore {

	protected Cheesecake createCheesecake(String kind) {
		Cheesecake cheesecake;
		
		CheesecakeIngredientFactory cheesecakeIngredientFactory = 
				new FilipinoCheesecakeIngredientFactory();
		
		cheesecake = new PineappleCheesecake(cheesecakeIngredientFactory);
		
		return cheesecake;
	}

}
