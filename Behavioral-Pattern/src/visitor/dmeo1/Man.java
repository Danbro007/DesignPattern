package visitor.dmeo1;

/**
 * @Classname Man
 * @Description TODO
 * @Date 2020/3/23 15:08
 * @Author Danrbo
 */
public class Man implements Person {
    @Override
    public void accept(Situation situation) {
        situation.act(this);
    }
}
