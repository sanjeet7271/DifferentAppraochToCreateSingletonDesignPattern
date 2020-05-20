package com.SingletonDesignPattern;

class threadsafeSingleton{
	private static threadsafeSingleton instance;
	private threadsafeSingleton() {
		System.out.println("Object created");
	}
	synchronized public static threadsafeSingleton getInstance() {
		if(instance==null) {
			instance=new threadsafeSingleton();
		}
		return instance;
	}
}

public class ThreadSafe {
	public static void main(String[] args) {
		threadsafeSingleton obj=threadsafeSingleton.getInstance();
	}

}
