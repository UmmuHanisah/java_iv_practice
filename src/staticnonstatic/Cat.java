package staticnonstatic;

public class Cat {

	String name;
	int age;
	int livesRemaining;
	
	public void meow() {
		System.out.println("Meow");
	}
}


/*
 * String name; 
 * int age; 
 * int livesRemaining;
 * 
 * public void meow() { 
 * System.out.println("Meow"); 
 * }
 * 
 * 
 * All these fields and method doesn't have static keyword,
 * so all of them only apply to the individual Cat object, not to the Cat class
 */
