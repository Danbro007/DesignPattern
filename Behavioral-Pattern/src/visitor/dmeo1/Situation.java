package visitor.dmeo1;

/**
 * @Classname Situation
 * @Description TODO
 * @Date 2020/3/23 15:10
 * @Author Danrbo
 */

/**
 * 状况抽象接口
 */
public abstract class Situation {
    /**
     * 男的遇到这个状况做出什么动作
     * @param man 男人
     */
    abstract void act(Man man);

    /**
     * 女的遇到这个状况做出什么动作
     * @param woman 女人
     */
    abstract void act(Woman woman);
}
