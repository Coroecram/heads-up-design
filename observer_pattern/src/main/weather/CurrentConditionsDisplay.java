package weather;

public Class CurrentConditionsDisplay implements Observer, DisplayElement {

  private float temperature;
  private float humidity;
  private float pressure;
  private float heatIndex;
  private Subject weatherData;

  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update(float temperature, float humidity, float pressure, float heatIndex;) {
    this.temperature = temperature;
    this.humidity  = humidity;
    this.pressure = pressure;
    this.heatIndex = heatIndex;

    display();
  }

  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity " + pressure + " millibars.\r\nThe heat index is: " + heatIndex + ".");
  }

}
