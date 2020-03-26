package mediater.demo1;

/**
 * @Classname Mediator
 * @Description TODO
 * @Date 2020/3/24 15:32
 * @Author Danrbo
 */

/**
 * 中介接口
 */
public interface Mediator {
    /**
     * 处理各个家电的逻辑
     * @param changeState 家电的状态
     * @param colleagueName 家电名
     */
    void getMessage(int changeState, String colleagueName);

    /**
     * 把家电注册到中介者
     * @param colleagueName 家电名
     * @param electricAppliance 家电实例对象
     */
    void register(String colleagueName, ElectricAppliance electricAppliance);
}


