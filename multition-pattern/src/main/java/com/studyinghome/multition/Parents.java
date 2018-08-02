package com.studyinghome.multition;

/**
 * ${DESCRIPTION}
 *
 * @author leslie
 * @create 2018-08-02 11:44
 */

public class Parents {

    public static void main(String[] args) {
        int parents = 2; //10个大臣
        for (int i = 0; i < parents; i++) {
            Children children = Children.getInstance();
            System.out.print("父母第" + (i + 1) + "次喊得名字是：");
            children.childInfo();
        }
    }
}
