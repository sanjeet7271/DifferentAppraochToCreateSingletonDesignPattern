package com.SingletonDesignPattern;


class staticblock{
	private static staticblock instance;
	private staticblock(){
		System.out.println("Object created");
	}
	static{
		instance=new staticblock();
	}
	public static staticblock getInstance(){
		return instance;
	}
}

public class UsingStaticBlock {

	public static void main(String[] args) {
		
		staticblock obj=staticblock.getInstance();
	}

}
