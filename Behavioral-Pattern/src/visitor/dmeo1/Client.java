package visitor.dmeo1;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2020/3/23 21:23
 * @Author Danrbo
 */

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(man);
        objectStructure.add(woman);

        Success success = new Success();
        Failure failure = new Failure();
        objectStructure.show(success);
        System.out.println("=====================");
        objectStructure.show(failure);
        System.out.println("=====================");
        Happy happy = new Happy();
        objectStructure.show(happy);
    }
}
