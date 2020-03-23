package iterator.demo1;

import java.util.ArrayList;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2020/3/23 20:16
 * @Author Danrbo
 */
public class Client {
    public static void main(String[] args) {
        //创建学院加入到list，用迭代器打印学院名和专业名
        InfoCollege infoCollege = new InfoCollege();
        ComputerCollege computerCollege = new ComputerCollege();
        ArrayList<College> colleges = new ArrayList<>();
        colleges.add(infoCollege);
        colleges.add(computerCollege);
        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.show();
    }
}
