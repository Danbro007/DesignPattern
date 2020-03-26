package state.demo1;

/**
 * @Classname DispenseState
 * @Description TODO
 * @Date 2020/3/26 12:56
 * @Author Danrbo
 */

import lombok.Data;

/**
 * 发奖状态
 */
@Data
public class DispenseState extends State {

    private RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    void reduceMoney() {
        System.out.println("积分已经扣除");
    }

    @Override
    boolean raffle() {
        System.out.println("抽奖已完成");
        return false;
    }

    /**
     * 先发奖品，然后奖品数减 1 ，如果奖品数为 0 则进入奖品发完状态（DispenseOutState）
     */
    @Override
    void despensePrize() {
        System.out.println("恭喜你中奖了");
        int count = this.getActivity().getCount();
        if (count > 0) {
            count -= 1;
            System.out.println("发送奖品，目前还剩下:" + count + "个！");
            this.getActivity().setCount(count);
            if (count == 0) {
                System.out.println("奖品已发完");
                this.getActivity().setState(this.getActivity().getDispenseOutState());
            } else {
                this.getActivity().setState(this.getActivity().getNoRaffleState());
            }
        } else {
            System.out.println("奖品已发完");
            this.getActivity().setState(this.getActivity().getDispenseOutState());
        }
    }
}
