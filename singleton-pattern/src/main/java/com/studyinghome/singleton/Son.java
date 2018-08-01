package com.studyinghome.singleton;

/**
 *
 * @author leslie
 * @create 2018-08-01 17:45
 */

public class Son {

    public static void main(String[] args) throws InterruptedException{
        //前天
        Father father1 = Father.getInstance();
        father1.fatherInfo();

        //昨天
        Father father2 = Father.getInstance();
        Father.fatherInfo();

        //今天
        Father father3 = Father.getInstance();
        father2.fatherInfo();
        father3.fatherInfo();
    }
}
