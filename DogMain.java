package oopProblems;

public class DogMain {

	public static void main(String[] args) {
		Dog dog1 = new Dog("jack", "Labrador");
		Dog dog2 = new Dog("Jon", "Bull Dog");
		
		System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
	    System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");

	    System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
	    
	    dog1.setBreed("Golden Retriever");
	    dog2.setName("mark");

	    System.out.println("\n"+dog1.getName() + " is now a " + dog1.getBreed() + ".");
	    System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");

	}

}
