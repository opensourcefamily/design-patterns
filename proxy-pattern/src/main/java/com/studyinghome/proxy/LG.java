package com.studyinghome.proxy;

/**
 * ${LG代工厂}
 *
 * @author leslie
 * @create 2018-08-01 16:43
 */
public class LG implements Factory {
    @Override
    public void make() {
        System.out.println("LG为Google生产nexus手机");
    }

    @Override
    public void fix() {
        System.out.println("LG为Google修理nexus手机");
    }
}
