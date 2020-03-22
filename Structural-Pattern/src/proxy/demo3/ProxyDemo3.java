package proxy.demo3;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Classname ProxyDemo3
 * @Description TODO cglib代理
 * @Date 2020/3/20 21:41
 * @Author Danrbo
 */
public class ProxyDemo3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        ProxyFactory proxyFactory = new ProxyFactory(teacher);
        Teacher proxyTeacher = (Teacher) proxyFactory.getProxyInstance();
        proxyTeacher.teach();
    }
}

/**
 * 老师类
 */
class Teacher {
    public void teach() {
        System.out.println("上课中。。。");
    }
}

/**
 * 代理工厂
 */
class ProxyFactory implements MethodInterceptor {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 使用Enhancer增强器创建目标对象的代理对象
     * @return 代理对象
     */
    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("准备上课！");
        Object resValue = method.invoke(target, args);
        System.out.println("结束上课！");
        return resValue;
    }
}