class Gorilla extends Mammal{
    public void throwSomething() {
        energy -= 5;
        System.out.println("The Gorilla has thrown something. Energy level:" + " " + energy);
    }

    public void eatBananas() {
        energy += 10;
        System.out.println("The Gorilla is satisfied. Energy level:" + " " + energy);
    }

    public void climb() {
        energy -= 10;
        System.out.println("The Gorilla has climbed a tree. Energy level:" + " " + energy);
    }
}