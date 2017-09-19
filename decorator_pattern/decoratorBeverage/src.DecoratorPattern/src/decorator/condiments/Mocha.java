package decorator.condiments;

import decorator.component.Beverage;

public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	@Override
	public double cost() {
		double price;
		switch(this.beverage.getSize()) {
		case TALL:
			return beverage.cost() + .15;
		case GRANDE:
			return beverage.cost() + .20;
		case VENTI:
			return beverage.cost() + .25;
		default:
			return beverage.cost() + .20;
		}	
	}

}
