public class Bat extends Mammal {
    public Bat(int energyLevel) {
        super(energyLevel);
    }

    public int fly() {
        System.out.println("The bat is taking off!");
        this.energyLevel -= 50;
        return energyLevel;
    }

    public int eatHumans() {
        System.out.println("The bat is eating humans!");
        this.energyLevel += 25;
        return energyLevel;
    }

    public int attackTown() {
        System.out.println("The bat is attacking a town!");
        this.energyLevel -= 100;
        return energyLevel;
    }
}