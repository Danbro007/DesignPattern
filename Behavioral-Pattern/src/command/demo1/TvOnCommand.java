package command.demo1;

/**
 * @Classname TvOnCommand
 * @Description TODO
 * @Date 2020/3/23 10:55
 * @Author Danrbo
 */

public class TvOnCommand implements Command {
    private TvReciever tvReciever;

    public TvOnCommand(TvReciever tvReciever) {
        this.tvReciever = tvReciever;
    }


    @Override
    public void execute() {
        tvReciever.on();
    }

    @Override
    public void undo() {
        tvReciever.off();
    }
}
