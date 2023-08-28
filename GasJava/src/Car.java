public class Car {
    String brand;
    double tankSize;
    double currentTank;
    String type;


    public Car(String brand, double tankSize, double currentTank, String type) {
        this.brand = brand;
        this.tankSize = tankSize;
        this.currentTank = currentTank;
        this.type = type;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", tankC=" + tankSize +
                ", currentTank=" + currentTank +
                ", type='" + type + '\'' +
                '}';
    }

    public double getTankC() {
        return tankSize;
    }

    public void setTankC(double tankC) {
        this.tankSize = tankC;
    }

    public double getTankA() {
        return currentTank;
    }

    public void setTankA(double currentTank) {
        this.currentTank = Car.this.currentTank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        if (Double.compare(tankSize, car.tankSize) != 0) return false;
        if (Double.compare(currentTank, car.currentTank) != 0) return false;
        if (!brand.equals(car.brand)) return false;
        return type.equals(car.type);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand.hashCode();
        temp = Double.doubleToLongBits(tankSize);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(currentTank);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + type.hashCode();
        return result;
    }
}
