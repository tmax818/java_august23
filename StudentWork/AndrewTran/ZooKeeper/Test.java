public class Test {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);
        gorilla.displayEnergy();

        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();

        gorilla.eatBananas();
        gorilla.eatBananas();

        gorilla.climb();

        gorilla.displayEnergy();

        Bat bat = new Bat(300);
        bat.displayEnergy();

        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        bat.eatHumans();
        bat.eatHumans();

        bat.fly();
        bat.fly();

        bat.displayEnergy();
    }
}
