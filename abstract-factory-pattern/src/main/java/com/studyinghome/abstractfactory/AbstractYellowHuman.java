package com.studyinghome.abstractfactory;

/**
 * ${黄种人的抽象类}
 *
 * @author leslie
 * @create 2018-08-02 15:44
 */

public abstract class AbstractYellowHuman implements Human {
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
