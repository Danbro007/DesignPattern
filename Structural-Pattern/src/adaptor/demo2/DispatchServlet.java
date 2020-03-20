package adaptor.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname DispatchServlet
 * @Description TODO 模拟SpringMVC里的DispatchServlet
 * @Date 2020/3/20 11:28
 * @Author Danrbo
 */
public class DispatchServlet {
    private static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public static void main(String[] args) {
        /**
         * 根据不同的controller用相应的适配器执行controller的handle方法
         */
        DispatchServlet dispatchServlet = new DispatchServlet();
        SimpleController simpleController = new SimpleController();
        dispatchServlet.dispatch(simpleController);
        System.out.println("-----------------");
        HttpController httpController = new HttpController();
        dispatchServlet.dispatch(httpController);
        System.out.println("-----------------");
        AnnotationController annotationController = new AnnotationController();
        dispatchServlet.dispatch(annotationController);
    }

    public DispatchServlet() {
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
    }

    /**
     * 先找到controller相应的适配器，然后用适配器的handle方法执行controller的handle方法
     * @param controller 控制器
     */
    public void dispatch(Controller controller) {
        HandlerAdapter handlerAdapter = getHandler(controller);
        if (handlerAdapter != null) {
            //找到相应的适配器，执行该适配器的方法
            handlerAdapter.handle(controller);
        }
    }

    /**
     * 遍历存储所有适配器的list，找到相应的适配器
     *
     * @param controller 需要寻找相应适配的congtroller
     * @return 返回与controller相应的适配器
     */
    public HandlerAdapter getHandler(Controller controller) {
        for (HandlerAdapter handlerAdapter : handlerAdapters) {
            if (handlerAdapter.support(controller)) {
                return handlerAdapter;
            }
        }
        return null;
    }
}
