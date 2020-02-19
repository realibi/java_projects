package classWorks.nasledovanie;

import java.util.ArrayList;
import java.util.List;

public class Area extends Entity {
    private City center;
    private List<City> cities = new ArrayList<>();

    public Area(String name, City center) {
        super(name);
        this.center = center;
        cities.add(center);
    }

    public City getCenter() {
        return center;
    }

    public void setCenter(City center) {
        this.center = center;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
