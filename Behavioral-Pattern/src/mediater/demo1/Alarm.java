package mediater.demo1;

/**
 * @Classname Alarm
 * @Description TODO
 * @Date 2020/3/24 16:13
 * @Author Danrbo
 */
public class Alarm extends Colleague {

    public Alarm(String name, Mediator mediator) {
        super(name, mediator);
        this.getMediator().register(name, this);
    }
}
