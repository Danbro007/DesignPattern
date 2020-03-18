package factory.simpleFactory;

/**
 * @Classname ReflectFactoryDemo
 * @Description TODO 反射工厂模式
 * @Date 2020/3/18 13:02
 * @Author Danrbo
 */
public class ReflectFactoryDemo {
    public static void main(String[] args) throws Exception {
        Circle circle = (Circle) ShapeFactory2.getClass(Circle.class);
        circle.draw();
        Square square = (Square) ShapeFactory2.getClass(Square.class);
        square.draw();
        Rectangle rectangle = (Rectangle) ShapeFactory2.getClass(Rectangle.class);
        rectangle.draw();
    }
}

/**
 * 通过工厂的getClass方法反射出shape相应的对象
 */
class ShapeFactory2 {
    public static Object getClass(Class<? extends Shape> clazz) throws Exception {
        Object o;
        o = Class.forName(clazz.getName()).newInstance();
        return o;
    }
}