package prototype;

/**
 * @Classname CopyDemo
 * @Description TODO 深拷贝与浅拷贝
 * @Date 2020/3/19 10:03
 * @Author Danrbo
 */
public class CopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Head head = new Head(new Face());
        Body body1 = new Body(head);
        Body body2 = (Body) body1.clone();
        String res = body1.head.face.hashCode() == body2.head.face.hashCode() ? "浅拷贝" : "深拷贝";
        System.out.println(res);
    }
}


class Person implements Cloneable {
    private int age;
    private String name;
    private Head head;

    public Person(int age, String name, Head head) {
        this.age = age;
        this.name = name;
        this.head = head;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person;
        person = (Person) super.clone();
        Head head = (Head) person.getHead().clone();
        person.setHead(head);
        return person;
    }
}

class Body implements Cloneable {
    public Head head;

    public Body(Head head) {
        this.head = head;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Body b;
        b = (Body) super.clone();
        b.head = (Head) b.head.clone();
        return b;
    }
}

class Head implements Cloneable {
    public Face face;

    public Head(Face face) {
        this.face = face;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Head head;
        head = (Head)super.clone();
        head.face = (Face) head.face.clone();
        return head;
    }
}

class Face implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}