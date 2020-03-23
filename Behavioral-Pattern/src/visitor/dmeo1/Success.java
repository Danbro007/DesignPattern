package visitor.dmeo1;

/**
 * @Classname Success
 * @Description TODO
 * @Date 2020/3/23 15:11
 * @Author Danrbo
 */
public class Success extends Action {

    @Override
    void act(Man man) {
        System.out.println("男的成功状态");
    }

    @Override
    void act(Woman woman) {
        System.out.println("女的成功状态");
    }
}
