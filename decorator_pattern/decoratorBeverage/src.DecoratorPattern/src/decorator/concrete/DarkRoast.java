package decorator.concrete;

import decorator.component.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}

	@Override
	public double cost() {
		double price;
		switch(this.getSize()) {
		case TALL:
			price = .50;
		case GRANDE:
			price = .99;
		case VENTI:
			price = 1.29;
		default:
			price = .99;
		}
		
		return price;		
	}

}
