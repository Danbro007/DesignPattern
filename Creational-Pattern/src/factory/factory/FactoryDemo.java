package factory.factory;

/**
 * @Classname FactoryDemo
 * @Description TODO 工厂模式
 * @Date 2020/3/18 13:20
 * @Author Danrbo
 */
public class FactoryDemo {
    public static void main(String[] args) {
        //创建具体的工厂
        SquareFactory squareFactory = new SquareFactory();
        //生产图形
        Shape square = squareFactory.getShape();
        //调用该图形的draw方法
        square.draw();
    }
}

/**
 * 圆形工厂
 */
class CircleFactory implements Factory {

    @Override
    public Shape getShape() {
        return new Circle();
    }
}

/**
 * 正方形工厂
 */
class SquareFactory implements Factory {

    @Override
    public Shape getShape() {
        return new Square();
    }
}

/**
 * 长方形工厂
 */
class RectangleFactory implements Factory {

    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}

interface Factory {
    Shape getShape();
}

interface Shape {
    void draw();
}

/**
 * 圆形
 */
class Circle implements Shape {
    public Circle() {
        System.out.println("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}

/**
 * 长方形
 */
class Rectangle implements Shape {
    public Rectangle() {
        System.out.println("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}

/**
 * 正方形
 */
class Square implements Shape {
    public Square() {
        System.out.println("Square");
    }

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}

