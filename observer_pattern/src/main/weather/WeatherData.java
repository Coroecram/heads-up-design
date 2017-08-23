package weather;

public class WeatherData implements Subject{

    private ArrayList<Observer> observers;
    private float temp;
    private float humidity; //assume relative
    private float pressure;
    private float heatIndex;

    public WeatherData() {
      observers = new ArrayList<Observer>;
    }

    public void registerObserver(Observer o) {
      int i = observers.indexOf(o);

      if (i == 0) {
        observers.add(o);
      }
    }

    public void removeObserver(Observer o) {
      int i = observers.indexOf(o);

      if (i >= 0) {
        observers.remove(i);
      }
    }

    public void notifyObservers() {
      for (Observer o : observers) {
        o.update(temperature, humidity, pressure), heatIndex
      }
    }

    public void measurementsChanged() {
      notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
      this.temperature = temperature;
  		this.humidity = humidity;
  		this.pressure = pressure;
      this.heatIndex = computeHeatIndex;

  		measurementsChanged();
    }

    private float computeHeatIndex() {
      float index = (float)((16.923 + (0.185212 * this.temperature) + (5.37941 * this.humidity) - (0.100254 * this.temperature * this.humidity)
        + (0.00941695 * (this.temperature * this.temperature)) + (0.00728898 * (this.humidity * this.humidity))
        + (0.000345372 * (this.temperature * this.temperature * this.humidity)) - (0.000814971 * (this.temperature * this.humidity * this.humidity)) +
        (0.0000102102 * (this.temperature * this.temperature * this.humidity * this.humidity)) - (0.000038646 * (this.temperature * this.temperature * this.temperature)) + (0.0000291583 *
        (this.humidity * this.humidity * this.humidity)) + (0.00000142721 * (this.temperature * this.temperature * this.temperature * this.humidity)) +
        (0.000000197483 * (this.temperature * this.humidity * this.humidity * this.humidity)) - (0.0000000218429 * (this.temperature * this.temperature * this.temperature * this.humidity * this.humidity)) +
        0.000000000843296 * (this.temperature * this.temperature * this.humidity * this.humidity * this.humidity)) -
        (0.0000000000481975 * (this.temperature * this.temperature * this.temperature * this.humidity * this.humidity * this.humidity)));

      return heatIndex;
    }

    public float getTemperature() {
      return temperature;
    }

    public float getHumidity() {
      return humidity;
    }

    public float getPressure() {
      return pressure;
    }


}
