package command.demo1;

/**
 * @Classname LightOffCommand
 * @Description TODO
 * @Date 2020/3/23 10:54
 * @Author Danrbo
 */

/**
 * 电灯关闭命令类
 */
public class LightOffCommand implements Command {
    private LightReciever lightReciever;

    public LightOffCommand(LightReciever lightReciever) {
        this.lightReciever = lightReciever;
    }

    @Override
    public void execute() {
        lightReciever.off();
    }

    @Override
    public void undo() {
        lightReciever.on();
    }
}
