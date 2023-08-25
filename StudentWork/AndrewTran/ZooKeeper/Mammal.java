public class Mammal {
    protected int energyLevel;

    public Mammal(int energyLevel) {
        this.energyLevel = 100;
    }

    public int displayEnergy() {
        System.out.println("Energy level: " + energyLevel);
        return energyLevel;
    }
}
