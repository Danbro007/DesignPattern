package mediater.demo1;

import sun.plugin2.gluegen.runtime.CPU;

import java.util.HashMap;

/**
 * @Classname ConcreteMediator
 * @Description TODO
 * @Date 2020/3/24 15:32
 * @Author Danrbo
 */
public class ConcreteMediator implements Mediator {
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void getMessage(int changeState, String colleagueName) {

    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName,colleague);
        if (colleague instanceof Alarm){
            interMap.put("Alarm",colleagueName);
        }else if (colleague instanceof )
    }

    @Override
    public void sendMessage() {

    }


}
