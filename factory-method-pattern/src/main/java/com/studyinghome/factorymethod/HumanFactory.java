package com.studyinghome.factorymethod;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * 工厂方法模式有一个非常重要的应用，就是延迟始化(Lazy initialization)，什么是延迟始化呢？
 * 一个对象初始化完毕后就不释放，等到再次用到得就不用再次初始化了，直接从内存过中拿到就可以了，
 *
 * @author leslie
 * @create 2018-08-02 14:19
 */

public class HumanFactory {
    //定义一个MAP,初始化过的Human对象都放在这里
    private static HashMap<String, Human> humans = new HashMap<>();

    /**
     * 按照指定的条件制造人类，每次只能制造一个
     */
    public static Human createHuman(Class c) {
        Human human = null;
        try {
            //如果MAP中有，则直接从取出，不用初始化了,通过这种方式可以很好的减少项目的复杂程度。
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
                //放到Map种
                humans.put(c.getSimpleName(), human);
            }
        } catch (InstantiationException e) {
            System.out.println("必须指定人种颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误");
        } catch (ClassNotFoundException e) {
            System.out.println("未找到指定的人");
        }
        return human;
    }

    /**
     * 一个一个制造人太麻烦，所以想实现自动制造人类
     */
    public static Human createHuman() {
        Human human = null; //定义一个类型的人类
        //首先是获得有多少个实现类，多少个人类
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
        //随机产生人类
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));
        return human;
    }
}
