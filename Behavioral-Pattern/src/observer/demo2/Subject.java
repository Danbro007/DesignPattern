package observer.demo2;

/**
 * @Classname Subject
 * @Description TODO
 * @Date 2020/3/24 13:24
 * @Author Danrbo
 */
public interface Subject {
    void registerSubject(Observer observer);

    void removeSubject(Observer observer);

    void notifySubjects();
}
