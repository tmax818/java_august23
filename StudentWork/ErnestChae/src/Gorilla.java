
public class Gorilla extends Mammal{

	public void throwSomething() {
		energy -= 5;
		System.out.println("Gorilla has thrown something");
	}
	
	public void eatBananas() {
		energy += 10;
		System.out.println("The gorilla is satisfied");
	}
	
	public void climb() {
		energy -=10;
		System.out.println("The gorilla has climbed a tree");
	}
}
