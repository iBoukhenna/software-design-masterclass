package com.example.singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instance = DbSingleton.getInstance();

		System.out.println(instance);
		instance = DbSingleton.getInstance();

		System.out.println(instance);
	}
}
