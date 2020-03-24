package mediater.demo1;

/**
 * @Classname Colleague
 * @Description TODO
 * @Date 2020/3/24 15:34
 * @Author Danrbo
 */
public abstract class Colleague {
    private String name;
    private Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public Mediator getMediator(){
        return this.mediator;
    }
}
