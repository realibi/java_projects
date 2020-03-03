package classWorks.FilesLesson;

import java.io.Serializable;

public class Car implements Serializable {
    private String model;
    private int EnginePower;
    private transient String vinCode;

    public Car(String model, int enginePower, String vinCode) {
        this.model = model;
        EnginePower = enginePower;
        this.vinCode = vinCode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", EnginePower=" + EnginePower +
                ", vinCode='" + vinCode + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int enginePower) {
        EnginePower = enginePower;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }
}
