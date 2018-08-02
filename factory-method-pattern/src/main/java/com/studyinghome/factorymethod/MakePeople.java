package com.studyinghome.factorymethod;

/**
 * ${DESCRIPTION}
 *
 * @author leslie
 * @create 2018-08-02 14:51
 */

public class MakePeople {
    public static void main(String[] args) {

        //1.通过自定义产生不同人类，一次制造一个
        //第一次造白人
        System.out.println("------------造出的第一批人是：白人-----------------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();
        //第二次黑人
        System.out.println("\n------------造出的第二批人是：黑人-----------------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();
        //第三次黄种人
        System.out.println("\n------------造出的第三批人是：黄种人-----------------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();


        //2.随机性自动产生人类
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n------------第" + i + "次随机产生人类-----------------");
            Human human = HumanFactory.createHuman();
            human.cry();
            human.laugh();
            human.talk();
        }
    }
}
