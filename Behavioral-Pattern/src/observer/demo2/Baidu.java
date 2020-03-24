package observer.demo2;

/**
 * @Classname Baidu
 * @Description TODO
 * @Date 2020/3/24 13:36
 * @Author Danrbo
 */
public class Baidu implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private String siteName;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        this.siteName = "百度";
        display();
    }

    private void display() {
        System.out.println(siteName + "***Today Temperature:[" + temperature + "]***");
        System.out.println(siteName + "***Today humidity:[" + humidity + "]***");
        System.out.println(siteName + "***Today pressure:[" + pressure + "]***");
        System.out.println("-----------------------------------------------");
    }
}
