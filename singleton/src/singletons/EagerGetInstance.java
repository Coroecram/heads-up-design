package singletons;

public class EagerGetInstance {
	
	private static EagerGetInstance uniqueInstance = new EagerGetInstance ();
	
	private EagerGetInstance () {}
	
	public static EagerGetInstance getInstance() {
		return uniqueInstance;
	}

}
