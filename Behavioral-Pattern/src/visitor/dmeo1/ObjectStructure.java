package visitor.dmeo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ObjectStructure
 * @Description TODO
 * @Date 2020/3/23 15:17
 * @Author Danrbo
 */
public class ObjectStructure {
    private List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public void show(Action action) {
        for (Person person : personList) {
            person.accept(action);
        }
    }

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
