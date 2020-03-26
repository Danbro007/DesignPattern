package state.demo1;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2020/3/26 12:45
 * @Author Danrbo
 */
public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(3);
        for (int i = 0; i < 20; i++) {
            if (activity.getCount() == 0){
                break;
            }
            activity.run();
            System.out.println("----------------------");
        }
    }
}
