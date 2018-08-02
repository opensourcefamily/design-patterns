package com.studyinghome.factorymethod;

/**
 * ${黄种人}
 *
 * @author leslie
 * @create 2018-08-02 14:05
 */

public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黄种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说汉语");
    }
}
