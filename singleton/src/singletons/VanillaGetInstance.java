package singletons;

public class VanillaGetInstance {
	
	private static VanillaGetInstance uniqueInstance;
	
	private VanillaGetInstance() {}
	
	public static synchronized VanillaGetInstance getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new VanillaGetInstance();
		}
		
		return uniqueInstance;
	}

}
