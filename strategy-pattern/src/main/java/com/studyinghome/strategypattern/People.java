package com.studyinghome.strategypattern;

/**
 * ${顾客}
 *
 * @author leslie
 * @create 2018-08-01 14:40
 */

public class People {
    /**
     * 顾客出场了
     */
    public static void main(String[] args) {
        Juicer juicer;
        //第一个客人想喝苹果汁
        System.out.println("------------我要苹果汁------------");
        juicer = new Juicer(new Apple()); //拿到苹果
        juicer.operate(); //榨苹果汁
        //第二个客人想和菠萝汁
        System.out.println("------------我要菠萝汁------------");
        juicer = new Juicer(new Pineapple());//拿到菠萝
        juicer.operate(); //榨菠萝汁
        //第三个客人想和橙汁
        System.out.println("------------我要橙汁------------");
        juicer = new Juicer(new Orange());//拿到橙子
        juicer.operate(); //榨橙汁
    }
}
