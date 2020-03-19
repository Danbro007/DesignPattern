package bridge;

/**
 * @Classname BridgeDemo1
 * @Description TODO 未使用桥接模式
 * @Date 2020/3/19 13:19
 * @Author Danrbo
 */
public class BridgeDemo1 {
    public static void main(String[] args) {

    }
}


class Phone {
    public void call() {

    }
}


class FoldedPhone extends Phone {
}

class UpRightPhone extends Phone {
}

class SlidePhone extends Phone {
}


class XiaoMi1 extends FoldedPhone {

}

class Huawei1 extends FoldedPhone {

}

class Vivo1 extends FoldedPhone {

}

class XiaoMi2 extends UpRightPhone {

}

class Huawei2 extends UpRightPhone {

}

class Vivo2 extends UpRightPhone {

}

class XiaoMi3 extends SlidePhone {

}

class Huawei3 extends SlidePhone {

}

class Vivo3 extends SlidePhone {

}