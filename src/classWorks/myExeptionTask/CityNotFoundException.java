package classWorks.myExeptionTask;

public class CityNotFoundException extends Exception {
    private String message = "Нет такого города";
    private String cityName;

    public CityNotFoundException(String cityName) {
        this.cityName = cityName;
    }

    public CityNotFoundException(String message, String cityName) {
        this.message = message;
        this.cityName = cityName;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
