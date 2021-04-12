package com.worldbiomusic.designpatten.singleton;

public class DangerousSingleton {
	private static DangerousSingleton instance;

	private DangerousSingleton() {

	}

	public static DangerousSingleton getInstance() {
		if (instance == null) {
			instance = new DangerousSingleton();
		}
		return instance;
	}
}
