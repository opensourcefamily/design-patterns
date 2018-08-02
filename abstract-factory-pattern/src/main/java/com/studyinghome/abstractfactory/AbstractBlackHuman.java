package com.studyinghome.abstractfactory;

/**
 * ${黑种人的抽象类}
 *
 * @author leslie
 * @create 2018-08-02 15:51
 */

public abstract class AbstractBlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑种人会说话");
    }
}

