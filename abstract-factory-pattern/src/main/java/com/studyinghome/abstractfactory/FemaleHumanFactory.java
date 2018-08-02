package com.studyinghome.abstractfactory;

/**
 * ${专门制造女性}
 *
 * @author leslie
 * @create 2018-08-02 16:14
 */

public class FemaleHumanFactory extends AbstractHumanFactory {
    //创建一个女性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

    //创建一个女性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    //创建一个女性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }
}
