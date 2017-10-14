package CheesecakeStore;

import Cheesecake.Cheesecake;
import Cheesecake.NewYorkCheesecake;
import IngredientFactory.CheesecakeIngredientFactory;
import IngredientFactory.NewYorkCheesecakeIngredientFactory;

public class NewYorkCheesecakeStore extends CheesecakeStore {

	protected Cheesecake createCheesecake() {
		Cheesecake cheesecake;
		
		CheesecakeIngredientFactory cheesecakeIngredientFactory = 
				new NewYorkCheesecakeIngredientFactory();
		
		cheesecake = new NewYorkCheesecake(cheesecakeIngredientFactory);
		
		return cheesecake;
	}

}
