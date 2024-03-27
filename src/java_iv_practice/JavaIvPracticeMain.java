package java_iv_practice;

public class JavaIvPracticeMain {

	public static void main(String[] args) {
		AnimalSingleton as = AnimalSingleton.getInstance();
		System.out.println(as);
		
		AnimalSingleton as2 = AnimalSingleton.getInstance();
		System.out.println(as2);
	}

}

/* Output 
 * ======
 * java_iv_practice.AnimalSingleton@649d209a
 * java_iv_practice.AnimalSingleton@649d209a
 * 
 * It will print same memory location, means it will not create a new instance
 * */
