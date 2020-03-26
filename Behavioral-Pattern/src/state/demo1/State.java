package state.demo1;

import lombok.Data;

/**
 * @Classname State
 * @Description TODO
 * @Date 2020/3/26 12:45
 * @Author Danrbo
 */
public abstract class State {

    /**
     * 减积分
     */
    abstract void reduceMoney();

    /**
     * 抽奖
     * @return true：抽中 false:没抽中
     */
    abstract boolean raffle();

    /**
     * 发奖品
     */
    abstract void despensePrize();
}
