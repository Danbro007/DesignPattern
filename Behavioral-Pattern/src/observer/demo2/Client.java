package observer.demo2;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2020/3/24 13:37
 * @Author Danrbo
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Sina sina = new Sina();
        Baidu baidu = new Baidu();
        Tencent tencent = new Tencent();
        weatherData.registerSubject(sina);
        weatherData.registerSubject(tencent);
        weatherData.registerSubject(baidu);
        System.out.println("***********第一次发布天气**************");
        weatherData.setData(22, 33, 55);
        System.out.println("***********更细天气**************");
        weatherData.setData(44, 55, 66);
    }
}
