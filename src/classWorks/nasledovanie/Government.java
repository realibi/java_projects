package classWorks.nasledovanie;

import java.util.ArrayList;
import java.util.List;

public class Government {
    private List<Area> areas = new ArrayList<>();

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public void showCapital(){
        for(Area area : this.areas){
            for(City city : area.getCities()){
                if(city.isCapital() == true){
                    System.out.println("Столица: " + city.getName());
                    break;
                }
            }
        }
    }

    public void showAreasCount(){
        System.out.println("Областей: " + this.areas.size());
    }

    public void showTotalSpace(){
        int totalSpace = 0;
        for(Area area : this.areas){
            for(City city : area.getCities()){
                totalSpace += city.getSpace();
            }
        }

        System.out.println("Общая площадь: " + totalSpace);
    }

    public void showAreaCenters(){
        System.out.println("Областные центры:");
        for(Area area : this.areas){
            System.out.println("\t" + area.getCenter().getName());
        }
    }
}
