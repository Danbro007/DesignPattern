package state.demo1;

/**
 * @Classname NoRaffleState
 * @Description TODO
 * @Date 2020/3/26 12:51
 * @Author Danrbo
 */

import lombok.Data;

/**
 * 不能抽奖状态
 */
@Data
public class NoRaffleState extends State {
    private RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 活动状态从不能抽奖状态转换成能抽奖状态
     */
    @Override
    void reduceMoney() {
        System.out.println("已经扣除积分，开始抽奖。");
        this.getActivity().setState(this.getActivity().getCanRaffleState());
    }

    @Override
    boolean raffle() {
        System.out.println("还未扣积分");
        return false;
    }

    @Override
    void despensePrize() {
        System.out.println("还未抽奖");
    }
}
