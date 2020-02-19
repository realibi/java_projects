package classWorks.nasledovanie_secondPart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Park {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void showParkPrice(){
        int totalPrice = 0;
        for(Car car : this.getCars()){
            totalPrice += car.getPrice();
        }

        System.out.println("Общая стоимость таксопарка: " + totalPrice);
    }

    public void showCars(){
        cars.sort( Comparator.comparing( Car::getFuel_consumption ) );
        System.out.println("Все авто:");
        for(Car car : this.cars){
            System.out.println(car.toString());
        }
    }

    public void showCarsWithinSpeedInterval(int num1, int num2){
        for(Car car : this.cars){
            if(car.getMaxSpeed() > num1 && car.getMaxSpeed() < num2) {
                System.out.println(car.toString());
            }
        }
    }
}
