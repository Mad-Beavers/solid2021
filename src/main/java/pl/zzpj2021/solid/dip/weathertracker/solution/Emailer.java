package pl.zzpj2021.solid.dip.weathertracker.solution;


public class Emailer implements WeatherAlert {
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
