package main;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		Duck rubber = new RubberDucky();
		mallard.performFly();
		mallard.performQuack();
		System.out.println();
		rubber.performFly();
		rubber.performQuack();
	}

}
