package decorator.condiments;

import decorator.component.Beverage;

public class Soy extends CondimentDecorator {
	
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double price;
		switch(this.beverage.getSize()) {
		case TALL:
			return beverage.cost() + .10;
		case GRANDE:
			return beverage.cost() + .15;
		case VENTI:
			return beverage.cost() + .20;
		default:
			return beverage.cost() + .15;
		}	
	}

}
