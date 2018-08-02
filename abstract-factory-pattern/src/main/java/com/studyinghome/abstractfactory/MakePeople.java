package com.studyinghome.abstractfactory;

/**
 * @author leslie
 * @create 2018-08-02 16:15
 */

public class MakePeople {
    public static void make() {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleHumanFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();
        //生产线建立完毕，开始生产人了:
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        maleYellowHuman.talk();
        maleYellowHuman.sex();
        System.out.println("----------------------------------");
        Human femaleYellowHuman = femaleHumanFactory.createWhiteHuman();
        femaleYellowHuman.cry();
        femaleYellowHuman.laugh();
        femaleYellowHuman.talk();
        femaleYellowHuman.sex();
    }
}
