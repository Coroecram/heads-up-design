package decorator.concrete;

import decorator.component.Beverage;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf Coffee";
	}

	@Override
	public double cost() {
		double price;
		switch(this.getSize()) {
		case TALL:
			price = .79;
		case GRANDE:
			price = 1.05;
		case VENTI:
			price = 1.49;
		default:
			price = 1.05;
		}
		
		return price;		
	}

}
