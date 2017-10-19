package singletons;

public class DoubleCheckedLockingGetInstance {
	
	private volatile static DoubleCheckedLockingGetInstance uniqueInstance;
	
	private DoubleCheckedLockingGetInstance() {}
	
	public static DoubleCheckedLockingGetInstance getInstance() {
		if (uniqueInstance == null) {
			synchronized (DoubleCheckedLockingGetInstance.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DoubleCheckedLockingGetInstance();
				}
			}
		}
		return uniqueInstance;
	}

}
