package observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname WeatherData
 * @Description TODO
 * @Date 2020/3/24 13:26
 * @Author Danrbo
 */
public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;

    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerSubject(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubject(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifySubjects() {
        observers.forEach(e ->
                e.update(this.temperature, this.humidity, this.pressure));
    }

    public void setData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifySubjects();
    }
}
