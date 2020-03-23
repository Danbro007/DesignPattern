package command.demo1;

/**
 * @Classname RemoteController
 * @Description TODO
 * @Date 2020/3/23 10:58
 * @Author Danrbo
 */

/**
 * 遥控器类
 */
public class RemoteController {


    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public static void main(String[] args) {
        //创建遥控器，把电灯的开启和关闭命令设置进遥控器
        RemoteController remoteController = new RemoteController();
        LightReciever lightReciever = new LightReciever();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReciever);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReciever);
        remoteController.setOnCommand(0, lightOnCommand, lightOffCommand);
        //按下开启按钮
        remoteController.pushOnButton(0);
        //按下关闭按钮
        remoteController.pushOffButton(0);
        //按下撤销按钮
        remoteController.pushUndoButton();
        //设置电视开关，并按下开启、关闭和撤销按钮
        TvReciever tvReciever = new TvReciever();
        TvOnCommand tvOnCommand = new TvOnCommand(tvReciever);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReciever);
        remoteController.setOnCommand(1,tvOnCommand,tvOffCommand);
        remoteController.pushOnButton(1);
        remoteController.pushOffButton(1);
        remoteController.pushUndoButton();
    }

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 设置命令
     *
     * @param no         命令的编号
     * @param onCommand  开启命令
     * @param offCommand 关闭命令
     */
    public void setOnCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下开启命令
     *
     * @param no 命令的编号
     */
    public void pushOnButton(int no) {
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    /**
     * 按下关闭命令
     *
     * @param no 命令编号
     */
    public void pushOffButton(int no) {
        offCommands[no].execute();
        undoCommand = onCommands[no];
    }

    /**
     * 按下撤销命令
     */
    public void pushUndoButton() {
        undoCommand.undo();
    }


}
