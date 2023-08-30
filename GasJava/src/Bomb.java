import java.util.ArrayList;
import java.util.List;

public class Bomb {

    public List<Car> cars = new ArrayList<>();
    private double gas = 5.2;
    private double ethanol = 4.7;
    private double diesel = 6.4;
    private double liters;
    double price;




    private boolean thereIsACar;

    public void park() {
        thereIsACar = true;
    }

    public void out() {
        thereIsACar = false;
    }

    public void fuel(Car car) {
        if (!thereIsACar && car.tankSize != car.currentTank) {
            liters = car.getTankC() - car.getTankA();
            price = price * liters;
            if (car.type.equalsIgnoreCase("gas")) {
                price = (car.tankSize - car.currentTank) * gas;
                park();
                car.setTankA(car.tankSize);
            }
            if (car.type.equalsIgnoreCase("ethanol")) {
                price = (car.tankSize - car.currentTank) * ethanol;
                car.setTankA(car.tankSize);
                park();
            }
            if (car.type.equalsIgnoreCase("diesel")) {
                price = (car.tankSize - car.currentTank) * diesel;
                car.setTankA(car.tankSize);
                park();
            }
        } else if (thereIsACar) {
            System.out.println("There is no bomb available right now.");
        } else if (car.currentTank == car.tankSize) {
            System.out.println("The fuel is already full.");
        }
    }


    public void addCar(String brand, double tankSize, double currentTank, String type) {
        cars.add(new Car(brand, tankSize, currentTank, type));
    }

    @Override
    public String toString() {
        return "Bomb{" +
                "cars=" + cars +
                ", gas=" + gas +
                ", ethanol=" + ethanol +
                ", diesel=" + diesel +
                ", liters=" + liters +
                ", price=" + price +
                ", thereIsACar=" + thereIsACar +
                '}';
    }
}
