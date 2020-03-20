package adaptor.demo2;

/**
 * @Classname HandlerAdapter
 * @Description TODO 模拟SpringMVC的HandlerAdapter
 * @Date 2020/3/20 11:22
 * @Author Danrbo
 */
public interface HandlerAdapter {
    boolean support(Object handler);

    void handle(Object handler);
}


class HttpHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean support(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }
}


class SimpleHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean support(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimpleHandler();
    }
}


class AnnotationHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean support(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }
}