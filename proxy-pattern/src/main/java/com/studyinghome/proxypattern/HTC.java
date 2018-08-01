package com.studyinghome.proxypattern;

/**
 * ${HTC代工厂}
 *
 * @author leslie
 * @create 2018-08-01 16:43
 */
public class HTC implements Factory {
    @Override
    public void make() {
        System.out.println("HTC为Google生产pixel手机");
    }

    @Override
    public void fix() {
        System.out.println("HTC为Google修理pixel手机");
    }
}
