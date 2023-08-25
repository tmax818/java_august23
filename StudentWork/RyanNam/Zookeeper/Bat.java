class Bat extends Mammal {
    public Bat() {
        this.energy = 300;
    }
    public void fly() {
        energy -= 50;
        System.out.println("The bat is airborne. Energy Level:" + " " + energy);
    }

    public void eatHumans() {
        energy += 25;
        System.out.println("The bat has eaten a human. Energy Level:" + " " + energy);
    }

    public void attackTown() {
        energy -= 100;
        System.out.println("The bat has attacked a town. It's a massacre!!! Energy Level:" + " " + energy);
    }

} 