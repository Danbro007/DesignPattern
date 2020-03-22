package proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname ProxyDemo2
 * @Description TODO 动态代理
 * @Date 2020/3/20 21:06
 * @Author Danrbo
 */
public class ProxyDemo2 {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TeacherDao teacher = (TeacherDao) proxyFactory.getInstance(new Teacher());
        teacher.teach();
    }
}

/**
 * 老师接口
 */
interface TeacherDao {
    void teach();
}

/**
 * 老师实体类
 */
class Teacher implements TeacherDao {

    @Override
    public void teach() {
        System.out.println("上课中。。。。");
    }
}

/**
 * 代理工厂
 */
class ProxyFactory {

    /**
     * 对象通过Proxy.newProxyInstance反射获取代理对象
     *
     * @param target 目标代理对象
     * @return 代理对象
     */
    public Object getInstance(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理模式开始。。。");
                Object resValue = method.invoke(target, args);
                System.out.println("动态代理模式结束。。。。");
                return resValue;
            }
        });
    }
}