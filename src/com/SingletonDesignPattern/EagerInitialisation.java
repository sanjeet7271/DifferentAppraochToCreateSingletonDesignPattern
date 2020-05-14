package com.SingletonDesignPattern;


/**
 * 
 * @author sanjeetpandit
 * 
 * Singleton Design Pattern
 *
 */

class SigletonEager{
	static SigletonEager obj=new SigletonEager();
	private SigletonEager() {
		System.out.println("Object created");
	}
	public static SigletonEager getInstance() {
		return obj;
	}
}
public class EagerInitialisation {

	public static void main(String[] args) {
		SigletonEager obj=SigletonEager.getInstance();
		
	}

}
