public class Station {
    public static Bomb b1 = new Bomb();
    public static Bomb b2 = new Bomb();

    public static void main(String[] args) {


        b1.addCar("BMW", 100, 20, "gas");
        b1.addCar("Mercedez", 40, 10, "ethanol");
        b1.addCar("Toyota", 100, 60, "gas");

        b2.addCar("Volks", 60, 30, "gas");
        b2.addCar("Jac", 20, 5, "ethanol");
        b2.addCar("Renault", 70, 80, "gas");


        new BombThread(2000, b2).start();
        new BombThread(2000, b1).start();

    }
}