package observer.demo1;

import lombok.Data;

/**
 * @Classname WeatherData
 * @Description TODO
 * @Date 2020/3/24 12:34
 * @Author Danrbo
 */
@Data
public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public void dataChange() {
        currentConditions.update(this.temperature, this.humidity, this.pressure);
    }

    public void setData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dataChange();
    }
}
