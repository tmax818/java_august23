public class Gorilla extends Mammal {
    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    public int throwSomething() {
        this.energyLevel -= 5;
        System.out.println("The gorilla has thrown something!");
        return energyLevel;
    }

    public int eatBananas() {
        this.energyLevel += 10;
        System.out.println("The gorilla is satisfied after eating bananas!");
        return energyLevel;
    }

    public int climb() {
        this.energyLevel -= 10;
        System.out.println("The gorilla has climbed a tree!");
        return energyLevel;
    }
}