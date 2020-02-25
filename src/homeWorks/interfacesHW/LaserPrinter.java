package homeWorks.interfacesHW;

public class LaserPrinter extends Printer implements IPrint<String> {
    public LaserPrinter(String model, boolean colorful) {
        super(model, colorful);
    }

    @Override
    public void print(String content) {
        System.out.println("Printed text: " + content);
    }

    @Override
    public void charge(String charger) {
        System.out.println("Printer " + this.getModel() + " charged with charger: " + charger);
    }
}
