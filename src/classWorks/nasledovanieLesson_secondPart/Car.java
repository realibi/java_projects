package classWorks.nasledovanieLesson_secondPart;

abstract class Car {
    private String model;
    private int maxSpeed;
    private int price;
    private double fuel_consumption;

    public Car(String model, int maxSpeed, int price, double fuel_consumption) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.fuel_consumption = fuel_consumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getFuel_consumption() {
        return fuel_consumption;
    }

    public void setFuel_consumption(double fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                ", fuel_consumption=" + fuel_consumption +
                '}';
    }
}
