package com.studyinghome.strategypattern;

/**
 * ${榨汁机}
 *
 * @author leslie
 * @create 2018-08-01 14:37
 */

public class Juicer {
    //构造函数，你要生产那种果汁
    private Tree tree;

    public Juicer(Tree strategy) {
        this.tree = strategy;
    }

    //榨果汁
    public void operate() {
        this.tree.operate();
    }
}
