package classWorks.nasledovanie;

import java.util.ArrayList;
import java.util.List;

public class City extends Entity {
    private boolean isCapital;
    private int space;
    private List<Region> regions = new ArrayList<>();

    public City(String name, boolean isCapital, int space) {
        super(name);
        this.isCapital = isCapital;
        this.space = space;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
}
