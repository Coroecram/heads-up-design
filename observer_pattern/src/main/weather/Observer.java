package weather;

Public interface Observer {
  public void update(float temp, float humidity, float pressure, float heatIndex);
}
