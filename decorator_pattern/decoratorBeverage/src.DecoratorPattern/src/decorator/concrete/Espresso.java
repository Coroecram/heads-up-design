package decorator.concrete;

import decorator.component.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		double price;
		switch(this.getSize()) {
		case TALL:
			price = .99;
		case GRANDE:
			price = 1.99;
		case VENTI:
			price = 2.99;
		default:
			price = 1.99;
		}
		
		return price;		
	}

}
