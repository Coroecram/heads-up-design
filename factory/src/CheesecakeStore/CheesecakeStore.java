package CheesecakeStore;

import Cheesecake.Cheesecake;
import IngredientFactory.CheesecakeIngredientFactory;

public abstract class CheesecakeStore {	
	
	public Cheesecake orderCheesecake(String kind) {
		Cheesecake cheesecake;
		
		cheesecake = createCheesecake(kind);
		
		cheesecake.prepare();
		cheesecake.bake();
		cheesecake.top();
		cheesecake.slice();
		cheesecake.box();
		
		return cheesecake;
	}
	
	protected abstract Cheesecake createCheesecake(String kind);

}
