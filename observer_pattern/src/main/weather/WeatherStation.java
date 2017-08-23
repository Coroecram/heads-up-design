package weather;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData  weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(50, 30, 82.2f);
    weatherData.setMeasurements(10, 75, 50.4f);
  }
}
