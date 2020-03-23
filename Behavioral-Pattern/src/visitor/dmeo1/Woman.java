package visitor.dmeo1;

/**
 * @Classname Woman
 * @Description TODO
 * @Date 2020/3/23 15:14
 * @Author Danrbo
 */
public class Woman implements Person {
    @Override
    public void accept(Situation situation) {
        situation.act(this);
    }
}
