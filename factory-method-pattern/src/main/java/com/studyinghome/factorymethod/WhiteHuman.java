package com.studyinghome.factorymethod;

/**
 * ${白种人}
 *
 * @author leslie
 * @create 2018-08-02 14:07
 */

public class WhiteHuman implements Human {
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
