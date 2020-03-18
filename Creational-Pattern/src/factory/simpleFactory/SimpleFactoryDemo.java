package factory.simpleFactory;

/**
 * @Classname SimpleFactoryDemo
 * @Description TODO 简单工厂模式
 * @Date 2020/3/18 12:51
 * @Author Danrbo
 */
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape("Circle");
        shape2.draw();
        Shape shape3 = ShapeFactory.getShape("Square");
        shape3.draw();
    }
}

/**
 * 画图draw接口
 */
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

/**
 * 图形创建工厂
 */
class ShapeFactory{
    public static Shape getShape(String shapeType){
        if (shapeType.equals("")){
            throw new RuntimeException("shapeType不能为空");
        }
        if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }else if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;

    }
}