package com.studyinghome.factorymethod;

/**
 * ${DESCRIPTION}
 *
 * @author leslie
 * @create 2018-08-02 14:51
 */

public class MakePeople {
    public static void main(String[] args) {
        HumanCreator creator = new HumanFactory();

        //1.通过自定义产生不同人类，一次制造一个
        //第一次造白人
        System.out.println("------------造出的第一批人是：白人-----------------");
        Human whiteHuman = creator.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();
        //第二次黑人
        System.out.println("\n------------造出的第二批人是：黑人-----------------");
        Human blackHuman = creator.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();
        //第三次黄种人
        System.out.println("\n------------造出的第三批人是：黄种人-----------------");
        Human yellowHuman = creator.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();

    }
}
