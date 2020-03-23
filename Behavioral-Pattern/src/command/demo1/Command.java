package command.demo1;

/**
 * @Classname Command
 * @Description TODO
 * @Date 2020/3/23 10:50
 * @Author Danrbo
 */

/**
 * 命令接口
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
