package state.demo1;

/**
 * @Classname CanRaffleState
 * @Description TODO
 * @Date 2020/3/26 12:53
 * @Author Danrbo
 */

import lombok.Data;

import java.util.Random;

/**
 * 可以抽奖状态
 */
@Data
public class CanRaffleState extends State {
    private RaffleActivity activity;
    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    void reduceMoney() {
        System.out.println("已经扣除了积分");
    }

    /**
     * 模拟抽奖，产生一个在 0 ~ 10 之间的随机书，判断是否为 0 ，是的话表示中奖了。
     * @return true:中奖    false:没中奖
     */
    @Override
    boolean raffle() {
        System.out.println("正在抽奖。。。。。");
        int num = new Random().nextInt(10);
        if (num == 0) {
            this.getActivity().setState(this.getActivity().getDispenseState());
            return true;
        }
        System.out.println("很遗憾没有中奖！");
        this.getActivity().setState(this.getActivity().getNoRaffleState());
        return false;
    }

    @Override
    void despensePrize() {
        System.out.println("抽奖还没开始！");
    }
}
