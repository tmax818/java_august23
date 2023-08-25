
public class GorillaTest {
	
	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla();
	
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		
		gorilla.eatBananas();
		gorilla.eatBananas();
		
		gorilla.climb();
		
		gorilla.displayEnergy();
		
		Bat bat = new Bat();
		
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		
		bat.fly();
		bat.fly();
		
		bat.displayEnergy();
	}

}
