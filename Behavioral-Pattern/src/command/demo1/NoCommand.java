package command.demo1;

/**
 * @Classname NoCommand
 * @Description TODO
 * @Date 2020/3/23 10:59
 * @Author Danrbo
 */

/**
 * 空命令，减少命令是否为空的判断。
 * 里面的方法都是空方法。
 */
public class NoCommand implements Command{

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
