package state.demo1;

import lombok.Data;

/**
 * @Classname RaffleActivity
 * @Description TODO
 * @Date 2020/3/26 12:45
 * @Author Danrbo
 */

/**
 * 抽奖活动类
 */
@Data
public class RaffleActivity {
    /**
     * 抽奖活动的状态
     */
    private State state;
    /**
     * 奖品数
     */
    private int count;
    /**
     * 加载各种抽奖状态
     */
    private NoRaffleState noRaffleState = new NoRaffleState(this);
    private CanRaffleState canRaffleState = new CanRaffleState(this);
    private DispenseState dispenseState = new DispenseState(this);
    private DispenseOutState dispenseOutState = new DispenseOutState(this);

    /**
     * 初始化时默认的状态为noRaffleState（未抽奖状态）
     * @param count
     */
    public RaffleActivity(int count) {
        this.count = count;
        this.state = noRaffleState;
    }

    /**
     * 开始减积分
     */
    private void reduceMoney() {
        state.reduceMoney();
    }

    /**
     * 如果现在活动的状态是抽中奖品则进入发奖品状态。
     */
    private void raffle() {
        if (state.raffle()) {
            state.despensePrize();
        }
    }

    /**
     * 开始抽奖，方便外部调用。
     */
    public void run(){
        reduceMoney();
        raffle();
    }
}
