import CheesecakeStore.*;


public class CheesecakerFactoryPattern {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		CheesecakeStore FCS = new FilipinoCheesecakeStore();
		FCS.orderCheesecake();
		CheesecakeStore NYCS = new NewYorkCheesecakeStore();
		NYCS.orderCheesecake();
		CheesecakeStore FrCS = new FrenchCheesecakeStore();
		FrCS.orderCheesecake();
	}

}
