package observer.demo2;

/**
 * @Classname Sina
 * @Description TODO
 * @Date 2020/3/24 13:25
 * @Author Danrbo
 */
public class Sina implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private String siteName;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        this.siteName = "新浪";
        display();
    }

    private void display() {
        System.out.println(siteName + "***Today Temperature:[" + temperature + "]***");
        System.out.println(siteName + "***Today humidity:[" + humidity + "]***");
        System.out.println(siteName + "***Today pressure:[" + pressure + "]***");
        System.out.println("-----------------------------------------------");
    }
}
