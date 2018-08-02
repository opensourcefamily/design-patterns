package com.studyinghome.singleton;

/**
 * ${单例类}
 *
 * @author leslie
 * @create 2018-08-01 17:44
 */

public class Father {
    private static final Father father = new Father();

    private Father() {
    }

    public synchronized static Father getInstance() {
        return father;
    }

    public static void fatherInfo() {
        System.out.println("我是你爸爸");
    }
}
