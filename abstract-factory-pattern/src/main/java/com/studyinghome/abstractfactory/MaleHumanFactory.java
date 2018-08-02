package com.studyinghome.abstractfactory;

/**
 * ${专门制造男性}
 *
 * @author leslie
 * @create 2018-08-02 16:14
 */

public class MaleHumanFactory extends AbstractHumanFactory {
    //创建一个男性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }

    //创建一个男性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    //创建一个男性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }
}
