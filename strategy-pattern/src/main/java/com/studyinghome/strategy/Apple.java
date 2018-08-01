package com.studyinghome.strategy;

/**
 * ${苹果树}
 *
 * @author leslie
 * @create 2018-08-01 14:32
 */

public class Apple implements Tree {

    @Override
    public void operate() {
        System.out.println("^_^ 苹果汁来了 ^_^\n");
    }
}
