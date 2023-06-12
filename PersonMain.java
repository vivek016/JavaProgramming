package oopProblems;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person1 = new Person("Goku", 33);
		Person person2 = new Person("Zoro", 31);
		
		System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
	    System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
	}

}
