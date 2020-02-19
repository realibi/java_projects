package classWorks.nasledovanie;

public class Runner {
    public static void main(String[] args) {
        City astana = new City("astana", true, 200000);

        Region saryarka = new Region("saryarka");
        astana.getRegions().add(saryarka);

        Area celinograd = new Area("celinograd", astana);
        celinograd.getCities().add(astana);

        Government kazakhstan = new Government();
        kazakhstan.getAreas().add(celinograd);

        kazakhstan.showCapital();
        kazakhstan.showTotalSpace();
        kazakhstan.showAreasCount();
        kazakhstan.showAreaCenters();
    }
}
