package com.studyinghome.factorymethod;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * 工厂方法模式有一个非常重要的应用，就是延迟始化(Lazy initialization)，什么是延迟始化呢？
 * 一个对象初始化完毕后就不释放，等到再次用到得就不用再次初始化了，直接从内存过中拿到就可以了，
 *
 * @author leslie
 * @create 2018-08-02 14:19
 */

public class HumanFactory implements HumanCreator {
    //定义一个MAP,初始化过的Human对象都放在这里
    private static HashMap<String, Human> humans = new HashMap<>();

    /**
     * 按照指定的条件制造人类
     */
    @Override
    public Human createHuman(Class c) {
        Human human = null;
        try {
            //如果MAP中有，则直接从取出，不用初始化了,通过这种方式可以很好的减少项目的复杂程度。
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
                //放到Map种
                humans.put(c.getSimpleName(), human);
            }
        } catch (InstantiationException e) {
            System.out.println("必须指定人种颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误");
        } catch (ClassNotFoundException e) {
            System.out.println("未找到指定的人");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return human;
    }
}
