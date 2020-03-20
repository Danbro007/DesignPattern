package facade.demo1;

/**
 * @Classname FacadeDemo1
 * @Description TODO 外观模式之电脑
 * @Date 2020/3/20 13:58
 * @Author Danrbo
 */
public class FacadeDemo1 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        System.out.println("---------------------");
        computer.shutDown();
    }
}

/**
 * 电脑类
 */
class Computer {
    private Disk disk;
    private Cpu cpu;
    private Memory memory;

    public Computer() {
        this.disk = Disk.getInstance();
        this.cpu = Cpu.getInstance();
        this.memory = Memory.getInstance();
    }

    public void start() {
        System.out.println("电脑开启。。。");
        disk.start();
        cpu.start();
        memory.start();
    }

    public void shutDown() {
        System.out.println("电脑关闭。。。");
        disk.shutDown();
        cpu.shutDown();
        memory.shutDown();
    }
}

/**
 * 硬盘实体类
 */
class Disk {
    private static Disk instance = new Disk();

    private Disk() {
    }

    public static Disk getInstance() {
        return instance;
    }

    public void start() {
        System.out.println("硬盘开启");
    }

    public void shutDown() {
        System.out.println("硬盘关闭");
    }
}

/**
 * 内存实体类
 */
class Memory {
    private static Memory instance = new Memory();

    private Memory() {
    }

    public static Memory getInstance() {
        return instance;
    }

    public void start() {
        System.out.println("内存开启");
    }

    public void shutDown() {
        System.out.println("内存关闭");
    }
}

class Cpu {
    private static Cpu instance = new Cpu();

    private Cpu() {
    }

    public static Cpu getInstance() {
        return instance;
    }

    public void start() {
        System.out.println("Cpu开启");
    }

    public void shutDown() {
        System.out.println("Cpu关闭");
    }
}