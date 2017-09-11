package main;

public class RubberDucky extends Duck {

	public RubberDucky() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("A duck. It's made of rubber.");

	}


}
