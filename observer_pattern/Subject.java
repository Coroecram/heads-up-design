package weather;

public interface Subject {
  public boolean registerObserver(Observer o);
  public boolean removeObserver(Observer o);
  public void notifyObservers();  
}
