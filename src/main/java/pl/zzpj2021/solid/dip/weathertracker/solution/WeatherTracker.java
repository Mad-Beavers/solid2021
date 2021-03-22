package pl.zzpj2021.solid.dip.weathertracker.solution;



public class WeatherTracker {
    String currentConditions;
    public void setCurrentConditions(String weatherDescription, WeatherAlert weatherAlert) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = weatherAlert.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = weatherAlert.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
