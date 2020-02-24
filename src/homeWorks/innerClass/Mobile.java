package homeWorks.innerClass;

import java.util.ArrayList;
import java.util.List;

public class Mobile {
    private MobileInfo info;

    public MobileInfo getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "info=" + info +
                '}';
    }

    public void setInfo(String model, int batteryCapacity, int price, int storageCapacity) {
        MobileInfo newInfo = new MobileInfo(model, batteryCapacity, price, storageCapacity);
        this.info = newInfo;
    }

    private static class MobileInfo{
        private String model;
        private int batteryCapacity;
        private int price;
        private int storageCapacity;

        public MobileInfo(String model, int batteryCapacity, int price, int storageCapacity) {
            this.model = model;
            this.batteryCapacity = batteryCapacity;
            this.price = price;
            this.storageCapacity = storageCapacity;
        }

        @Override
        public String toString() {
            return "MobileInfo{" +
                    "model='" + model + '\'' +
                    ", batteryCapacity=" + batteryCapacity +
                    ", price=" + price +
                    ", storageCapacity=" + storageCapacity +
                    '}';
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getBatteryCapacity() {
            return batteryCapacity;
        }

        public void setBatteryCapacity(int batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getStorageCapacity() {
            return storageCapacity;
        }

        public void setStorageCapacity(int storageCapacity) {
            this.storageCapacity = storageCapacity;
        }
    }
}
