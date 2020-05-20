package com.SingletonDesignPattern;

class LazySinglton{
	
	private static LazySinglton instance;
	private LazySinglton() {
		System.out.println("Object created");
	}
	public static LazySinglton getInstance() {
		if(instance==null) {
			instance=new LazySinglton();
		}
		return instance;
	}
	
}

public class LazyInitialisation {

	public static void main(String[] args) {
		LazySinglton obj=LazySinglton.getInstance();
	}

}
