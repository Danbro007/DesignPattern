package builder.kfc;

/**
 * @Classname KfcDemo
 * @Description TODO KFC套餐
 * @Date 2020/3/18 14:41
 * @Author Danrbo
 */
public class KfcDemo {
    public static void main(String[] args) {
        //创建MealB
        MealB mealB = new MealB();
        //被MealB创建食物和饮料
        mealB.buildDrink();
        mealB.buildFood();
        //创建服务员
        KFCWaiter kfcWaiter = new KFCWaiter();
        //设置好按什么套餐产出
        kfcWaiter.setMealBuilder(mealB);
        //生产食物
        Meal meal = kfcWaiter.construct();
        System.out.println(meal);//Meal{food='汉堡', drink='雪碧'}
    }
}

/**
 * 套餐类
 */
class Meal {
    private String food;
    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}

/**
 * 套餐生产抽象类
 */
abstract class MealBuilder {
    Meal meal = new Meal();

    abstract void buildFood();

    abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}

/**
 * 套餐A
 */
class MealA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("薯条");
    }

    @Override
    void buildDrink() {
        meal.setDrink("可乐");
    }
}

/**
 * 套餐B
 */
class MealB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("汉堡");
    }

    @Override
    void buildDrink() {
        meal.setDrink("雪碧");
    }
}

/**
 * KFC服务员
 */
class KFCWaiter {
    private MealBuilder mealBuilder;

    public KFCWaiter(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public KFCWaiter() {
    }

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct() {
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
        return mealBuilder.getMeal();
    }
}