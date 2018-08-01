package com.studyinghome.proxy;

/**
 * ${Google代理}
 *
 * @author leslie
 * @create 2018-08-01 16:44
 */
public class Google implements Factory {
    private Factory factory;

    public Google() {
        //默认HTC代工
        this.factory = new HTC();
    }

    public Google(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void make() {
        this.factory.make();
    }

    @Override
    public void fix() {
        this.factory.fix();
    }
}
