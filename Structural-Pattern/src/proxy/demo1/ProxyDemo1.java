package proxy.demo1;

/**
 * @Classname ProxyDemo1
 * @Description TODO 静态代理
 * @Date 2020/3/20 21:02
 * @Author Danrbo
 */
public class ProxyDemo1 {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(new RealMovie());
        cinema.play();
    }
}


interface Movie {
    void play();
}


class RealMovie implements Movie {
    @Override
    public void play() {
        System.out.println("您正在观看电影 《肖申克的救赎》");
    }
}

/**
 *
 */
class Cinema implements Movie {

    private Movie movie;

    public Cinema(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void play() {
        advertisement(true);
        movie.play();
        advertisement(false);
    }

    private void advertisement(boolean flag) {
        if (flag) {
            System.out.println("电影马上开始了，爆米花、可乐、口香糖9.8折，快来买啊！");
        } else {
            System.out.println("电影马上结束了，爆米花、可乐、口香糖9.8折，买回家吃吧！");
        }
    }
}