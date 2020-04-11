package com.techendear.creational.singleton;

public class MainClass {

	public static void main(String[] args) {
		SingletonClass class1 = SingletonClass.getInstance();
		System.out.println(class1);
		SingletonClass class2 = SingletonClass.getInstance();
		System.out.println(class2);
	}
}
