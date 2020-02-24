package homeWorks.interfaces;

public class Runner {
    public static void main(String[] args) {
        LaserPrinter laserPrinter = new LaserPrinter("HP Laserjet", true);

        laserPrinter.charge("super colors");
        laserPrinter.print("some text");
    }
}
