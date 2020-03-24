package observer.demo1;

/**
 * @Classname Client
 * @Description TODO 传统模式
 * @Date 2020/3/24 12:34
 * @Author Danrbo
 */
public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        System.out.println("----第一次发送预报-----");
        weatherData.setData(22, 33, 44);
        System.out.println("----第二次发送预报-----");
        weatherData.setData(33, 44, 55);
    }
}


