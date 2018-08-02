package com.studyinghome.multition;

import java.util.ArrayList;
import java.util.Random;

/**
 * 国家规定一个夫妻最多能有2个孩子
 *
 * @author leslie
 * @create 2018-08-02 11:45
 */

public class Children {
    private static int child = 2;
    private static ArrayList nameList = new ArrayList(child);
    private static ArrayList childList = new ArrayList(child);
    private static int childNum = 0;

    static {
        for (int i = 0; i < child; i++) {
            childList.add(new Children("第" + i + "个孩子"));
        }
    }

    private Children() {
    }//法律规定不让多生

    private Children(String name) {
        nameList.add(name);
    }

    public static Children getInstance() {
        Random random = new Random();
        childNum = random.nextInt(child);
        return (Children) childList.get(childNum);
    }

    //皇帝叫什么名字呀
    public static void childInfo() {
        System.out.println(nameList.get(childNum));
    }
}
