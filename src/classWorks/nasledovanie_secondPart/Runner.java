package classWorks.nasledovanie_secondPart;

public class Runner {
    public static void main(String[] args) {
        Park yandexTaxi = new Park();

        Toyota toyota = new Toyota("Corolla 2019", 260, 6000000, 10.0);
        Mercedes mercedes = new Mercedes("S-class 221", 320, 12000000, 15.0);
        yandexTaxi.getCars().add(toyota);
        yandexTaxi.getCars().add(mercedes);

        yandexTaxi.showCars();
        System.out.println();
        yandexTaxi.showParkPrice();
        System.out.println();
        yandexTaxi.showCarsWithinSpeedInterval(280, 350);
    }
}
