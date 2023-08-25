
public class Bat extends Mammal{
	
	public void fly() {
		energy -= 50;
		System.out.println("The bat is airborne.");
	}
	
	public void eatHumans() {
		energy += 25;
		System.out.println("The bat is satisfied");
	}
	
	public void attackTown() {
		energy -= 100;
		System.out.println("The bat has attacked the town");
	}
}
