package staticnonstatic;


// Source: https://www.youtube.com/watch?v=-Y67pdWHr9Y
public class StaticnonstaticMain {

	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.meow(); 
		// we can call this meow() method on our individual Cat object
		// non-static means they make sense and apply only to individual Cat object
		
		
		// Cat.meow();
		// The Cat class cannot meow
	}

}
