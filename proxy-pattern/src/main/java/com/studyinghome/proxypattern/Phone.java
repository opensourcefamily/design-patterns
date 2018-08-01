package com.studyinghome.proxypattern;

/**
 * @author leslie
 * @create 2018-08-01 16:53
 */

public class Phone {

    public static void main(String[] args) {
        //我要买pixel手机
        Google google = new Google();
        google.make();
        //修理pixel手机
        google.fix();

        System.out.println();

        //我要nexus手机
        google = new Google(new LG());
        google.make();
        //我要修理nexus手机
        google.fix();
    }
}
