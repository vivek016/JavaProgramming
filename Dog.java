package oopProblems;

public class Dog {
	private String name;
	private String Breed;
	
	public Dog(String name, String breed) {
		this.name = name;
		this.Breed = breed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.Breed = breed;
	}
	
	public String getName() {
		return name;
	}
	public String getBreed() {
		return Breed;
	}
	
}
