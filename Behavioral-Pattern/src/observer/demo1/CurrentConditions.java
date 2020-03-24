package observer.demo1;

/**
 * @Classname CurrentConditions
 * @Description TODO
 * @Date 2020/3/24 12:37
 * @Author Danrbo
 */

/**
 *
 */
public class CurrentConditions {
    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temperature,
                       float humidity,
                       float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }

    private void display() {
        System.out.println("***Today Temperature:[" + temperature + "]***");
        System.out.println("***Today humidity:[" + humidity + "]***");
        System.out.println("***Today pressure:[" + pressure + "]***");
    }
}
