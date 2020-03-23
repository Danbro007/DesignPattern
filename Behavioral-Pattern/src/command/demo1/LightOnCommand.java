package command.demo1;

/**
 * @Classname LightOnCommand
 * @Description TODO
 * @Date 2020/3/23 10:51
 * @Author Danrbo
 */

/**
 * 打开电灯命令类
 */
public class LightOnCommand implements Command {

    private LightReciever lightReciever;

    public LightOnCommand(LightReciever lightReciever) {
        this.lightReciever = lightReciever;
    }

    @Override
    public void execute() {
        lightReciever.on();
    }

    @Override
    public void undo() {
        lightReciever.off();
    }
}
