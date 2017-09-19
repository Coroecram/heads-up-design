package decorator.condiments;

import decorator.component.Beverage;

public class Whip extends CondimentDecorator {
	
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		double price;
		switch(this.beverage.getSize()) {
		case TALL:
			return beverage.cost() + .05;
		case GRANDE:
			return beverage.cost() + .10;
		case VENTI:
			return beverage.cost() + .15;
		default:
			return beverage.cost() + .10;
		}	
	}

}

