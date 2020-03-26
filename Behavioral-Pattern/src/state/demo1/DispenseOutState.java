package state.demo1;

/**
 * @Classname DispenseOutState
 * @Description TODO
 * @Date 2020/3/26 12:58
 * @Author Danrbo
 */

import lombok.Data;

/**
 * 不能发奖状态（奖品发完）
 */
@Data
public class DispenseOutState extends State {

    private RaffleActivity activity;
    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    void reduceMoney() {
        System.out.println("积分已扣除");
    }

    @Override
    boolean raffle() {
        System.out.println("抽奖已完成");
        return false;
    }

    @Override
    void despensePrize() {
        System.out.println("奖品发完了！");
    }

}
