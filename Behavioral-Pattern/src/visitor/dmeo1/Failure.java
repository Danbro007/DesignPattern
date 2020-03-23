package visitor.dmeo1;

/**
 * @Classname Failure
 * @Description TODO
 * @Date 2020/3/23 15:12
 * @Author Danrbo
 */
public class Failure extends Action {

    @Override
    void act(Man man) {
        System.out.println("男的失败状态");

    }

    @Override
    void act(Woman woman) {
        System.out.println("女的失败状态");
    }
}
