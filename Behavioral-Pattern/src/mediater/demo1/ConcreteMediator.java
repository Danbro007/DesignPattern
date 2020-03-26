package mediater.demo1;

import java.util.HashMap;

/**
 * @Classname ConcreteMediator
 * @Description TODO
 * @Date 2020/3/24 15:32
 * @Author Danrbo
 */

/**
 * 具体中介类
 */
public class ConcreteMediator implements Mediator {
    /**
     * 存放家电名和对应的家电实例对象
     */
    private HashMap<String, ElectricAppliance> colleagueMap;
    /**
     * 存储自定义的家电名和家电的名
     */
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    /**
     * 处理电器与电器之间的执行逻辑
     * 协调各个电器，完成任务。
     * 核心逻辑：
     *       闹钟先启动--->电视打开---->咖啡机启动---->电灯打开----->咖啡机关闭----->电视关闭
     *
     * @param changeState   状态信号
     * @param colleagueName 电器名
     */
    @Override
    public void getMessage(int changeState, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (changeState == 0) {
                colleagueMap.get(interMap.get("Alarm")).start();
                colleagueMap.get(interMap.get("Tv")).start();
            } else {
                colleagueMap.get(interMap.get("Alarm")).stop();
                colleagueMap.get(interMap.get("Tv")).stop();
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            if (changeState == 0) {
                colleagueMap.get(interMap.get("Light")).start();
            } else {
                colleagueMap.get(interMap.get("Tv")).stop();
            }
        } else if (colleagueMap.get(colleagueName) instanceof Light) {
            if (changeState == 0) {
                colleagueMap.get(interMap.get("CoffeeMachine")).stop();
            }
        } else if (colleagueMap.get(colleagueName) instanceof Tv) {
            if (changeState == 0) {
                colleagueMap.get(interMap.get("CoffeeMachine")).start();
            }
        }
    }

    /**
     * 在colleagueMap中注册电器名和实例
     *
     * @param colleagueName 电器名
     * @param electricAppliance     电器实例
     */
    @Override
    public void register(String colleagueName, ElectricAppliance electricAppliance) {
        colleagueMap.put(colleagueName, electricAppliance);
        if (electricAppliance instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (electricAppliance instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (electricAppliance instanceof Tv) {
            interMap.put("Tv", colleagueName);
        } else if (electricAppliance instanceof Light) {
            interMap.put("Light", colleagueName);
        }
    }
}
