package com.studyinghome.singleton;

/**
 * @author leslie
 * @create 2018-08-01 17:45
 */

public class Son {

    public static void main(String[] args) {
        //前天
        Father father1 = Father.getInstance();
        System.out.print("father1:");
        father1.fatherInfo();

        //昨天
        Father father2 = Father.getInstance();
        System.out.print("father:");
        Father.fatherInfo();

        //今天
        Father father3 = Father.getInstance();
        System.out.print("father2:");
        father2.fatherInfo();
        System.out.print("father3:");
        father3.fatherInfo();
    }
}
