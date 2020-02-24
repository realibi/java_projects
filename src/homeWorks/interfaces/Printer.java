package homeWorks.interfaces;

public class Printer {
    private String model;
    private boolean colorful;

    public Printer(String model, boolean colorful) {
        this.model = model;
        this.colorful = colorful;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isColorful() {
        return colorful;
    }

    public void setColorful(boolean colorful) {
        this.colorful = colorful;
    }
}
