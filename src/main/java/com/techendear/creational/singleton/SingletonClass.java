package com.techendear.creational.singleton;

public class SingletonClass {

	private static volatile SingletonClass singletonClass = null;

	private SingletonClass() {
		if (singletonClass != null) {
			throw new RuntimeException("Create instance using getInstance()");
		}
	}

	public static SingletonClass getInstance() {
		if (singletonClass == null) {
			synchronized (SingletonClass.class) {
				if (singletonClass == null)
					singletonClass = new SingletonClass();
			}
		}
		return singletonClass;
	}
}
