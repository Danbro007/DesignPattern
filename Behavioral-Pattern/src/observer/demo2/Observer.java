package observer.demo2;

/**
 * @Classname Observer
 * @Description TODO
 * @Date 2020/3/24 13:25
 * @Author Danrbo
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
