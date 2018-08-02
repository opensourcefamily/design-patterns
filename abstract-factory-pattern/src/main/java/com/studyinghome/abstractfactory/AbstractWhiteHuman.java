package com.studyinghome.abstractfactory;

/**
 * ${白种人的抽象类}
 *
 * @author leslie
 * @create 2018-08-02 15:48
 */

public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("白种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("白种人说英语");
    }
}
