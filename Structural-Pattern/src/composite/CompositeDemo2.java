package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname CompositeDemo2
 * @Description TODO 使用组合模式
 * @Date 2020/3/19 15:49
 * @Author Danrbo
 */
public class CompositeDemo2 {
    public static void main(String[] args) {
        //总公司、总公司HR和总公司财务
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HrDepartment("总公司HR部门"));
        root.add(new FinanceDepartment("总公司财务部门"));
        //广州分公司
        ConcreteCompany com1 = new ConcreteCompany("广州分公司");
        com1.add(new HrDepartment("广州分公司人力资源部"));
        com1.add(new FinanceDepartment("广州分公司财务部"));
        root.add(com1);
        //杭州分公司
        ConcreteCompany com2 = new ConcreteCompany("杭州分公司");
        com2.add(new HrDepartment("杭州分公司人力资源部"));
        com2.add(new FinanceDepartment("杭州分公司财务部"));
        root.add(com2);
        //深圳分公司
        ConcreteCompany com3 = new ConcreteCompany("深圳分公司");
        com3.add(new HrDepartment("深圳分公司人力资源部"));
        com3.add(new FinanceDepartment("深圳分公司财务部"));
        root.add(com3);

        System.out.println("公司结构图");
        root.display(1);
        System.out.println("各公司职责");
        root.lineOfDuty();
    }
}

/**
 * 公司抽象类
 * 定义了4个抽象方法
 */
abstract class Company {
    public String name;

    public Company(String name) {
        this.name = name;
    }

    abstract void add(Company company);

    abstract void remove(Company company);

    abstract void display(int depth);

    abstract void lineOfDuty();

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}

/**
 * 具体公司类
 * display方法是遍历childrenCompany里所有得公司或者部门，执行他们的display方法
 * lineOfDuty通上
 */
class ConcreteCompany extends Company {

    private List<Company> childrenCompany = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    void add(Company company) {
        childrenCompany.add(company);
    }

    @Override
    void remove(Company company) {
        childrenCompany.remove(company);
    }

    @Override
    void display(int depth) {
        System.out.println("第 " + depth + " 层的机构名为： " + name);
        for (Company c : childrenCompany) {
            c.display(depth + 1);
        }
    }

    @Override
    void lineOfDuty() {
        for (Company company : childrenCompany) {
            company.lineOfDuty();
        }
    }
}

/**
 * HR部门 叶子节点 不实现add和remove
 */
class HrDepartment extends Company {
    public HrDepartment(String name) {
        super(name);
    }

    @Override
    void add(Company company) {

    }

    @Override
    void remove(Company company) {

    }

    @Override
    void display(int depth) {
        System.out.println("第 " + depth + " 层的机构名为： " + name);
    }

    @Override
    void lineOfDuty() {
        System.out.println(name + "   负责公司财务收支管理");
    }
}

/**
 * 财务部门
 */
class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    void add(Company company) {

    }

    @Override
    void remove(Company company) {

    }

    @Override
    void display(int depth) {
        System.out.println("第 " + depth + " 层的机构名为： " + name);

    }

    @Override
    void lineOfDuty() {
        System.out.println(name + "   负责公司财务收支管理");
    }
}