package mediater.demo1;

/**
 * @Classname Mediator
 * @Description TODO
 * @Date 2020/3/24 15:32
 * @Author Danrbo
 */
public interface Mediator {
    void getMessage(int changeState, String colleagueName);

    void register(String colleagueName, ElectricAppliance electricAppliance);

}


