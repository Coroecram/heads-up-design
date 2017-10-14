package CheesecakeStore;

import Cheesecake.Cheesecake;
import Cheesecake.FrenchCheesecake;
import IngredientFactory.CheesecakeIngredientFactory;
import IngredientFactory.FrenchCheesecakeIngredientFactory;

public class FrenchCheesecakeStore extends CheesecakeStore {

	protected Cheesecake createCheesecake() {
		Cheesecake cheesecake;
		
		CheesecakeIngredientFactory cheesecakeIngredientFactory = 
				new FrenchCheesecakeIngredientFactory();
		
		cheesecake = new FrenchCheesecake(cheesecakeIngredientFactory);
		
		return cheesecake;
	}

}
