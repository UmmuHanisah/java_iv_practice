package java_iv_practice;

public class AnimalSingleton {

	// 1: Create a (private static instance of that class), initialize it to null
	// (static field to create one single object)
	private static AnimalSingleton SINGLE_INSTANCE = null;

	// 2: Create a private constructor
	private AnimalSingleton() {
	}

	// 3: Create a public method to create an instance
	// this block ensure only one instance is being created
	public static AnimalSingleton getInstance() {

		if (SINGLE_INSTANCE == null) {
			SINGLE_INSTANCE = new AnimalSingleton();
		}
		return SINGLE_INSTANCE;
	}
}

/*
 * What is a Singleton ? Singleton is a class whose only one instance is created
 * at any given time, in one JVM
 */
