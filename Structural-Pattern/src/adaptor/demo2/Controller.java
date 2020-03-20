package adaptor.demo2;

/**
 * @Classname Controller
 * @Description TODO 模拟SpringMVC的controller
 * @Date 2020/3/20 11:19
 * @Author Danrbo
 */
public interface Controller {
}

class HttpController implements Controller {
    public void doHttpHandler() {
        System.out.println("http....");
    }
}

class SimpleController implements Controller {
    public void doSimpleHandler() {
        System.out.println("simple....");
    }
}

class AnnotationController implements Controller {
    public void doAnnotationHandler() {
        System.out.println("annotation....");
    }
}
