package CheesecakeStore;

import Cheesecake.Cheesecake;
import Cheesecake.FilipinoCheesecake;
import IngredientFactory.CheesecakeIngredientFactory;
import IngredientFactory.FilipinoCheesecakeIngredientFactory;

public class FilipinoCheesecakeStore extends CheesecakeStore {

	protected Cheesecake createCheesecake() {
		Cheesecake cheesecake;
		
		CheesecakeIngredientFactory cheesecakeIngredientFactory = 
				new FilipinoCheesecakeIngredientFactory();
		
		cheesecake = new FilipinoCheesecake(cheesecakeIngredientFactory);
		
		return cheesecake;
	}

}
