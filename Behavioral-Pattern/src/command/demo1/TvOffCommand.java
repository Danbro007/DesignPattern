package command.demo1;

/**
 * @Classname TvOffCommand
 * @Description TODO
 * @Date 2020/3/23 10:57
 * @Author Danrbo
 */

/**
 * 电视关闭命令类
 */
public class TvOffCommand implements Command {
    private TvReciever tvReciever;

    public TvOffCommand(TvReciever tvReciever) {
        this.tvReciever = tvReciever;
    }

    @Override
    public void execute() {
        tvReciever.off();
    }

    @Override
    public void undo() {
        tvReciever.on();
    }
}
