package CheesecakeStore;

import Cheesecake.Cheesecake;
import IngredientFactory.CheesecakeIngredientFactory;

public abstract class CheesecakeStore {	
	
	public Cheesecake orderCheesecake() throws InterruptedException {
		Cheesecake cheesecake;
		
		cheesecake = createCheesecake();
		
		cheesecake.gather();
		cheesecake.prepare();
		cheesecake.bake();
		cheesecake.cool();
		cheesecake.top();
		cheesecake.slice();
		cheesecake.box();
		
		return cheesecake;
	}
	
	protected abstract Cheesecake createCheesecake();

}
