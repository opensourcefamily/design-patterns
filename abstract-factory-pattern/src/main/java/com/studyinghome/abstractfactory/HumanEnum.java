package com.studyinghome.abstractfactory;

/**
 * ${DESCRIPTION}
 *
 * @author leslie
 * @create 2018-08-02 16:04
 */

public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YelloMaleHuman("com.studyinghome.abstractfactory.YellowMaleHuman"),
    YelloFemaleHuman("com.studyinghome.abstractfactory.YellowFemaleHuman"),
    WhiteFemaleHuman("com.studyinghome.abstractfactory.WhiteFemaleHuman"),
    WhiteMaleHuman("com.studyinghome.abstractfactory.WhiteMaleHuman"),
    BlackFemaleHuman("com.studyinghome.abstractfactory.BlackFemaleHuman"),
    BlackMaleHuman("com.studyinghome.abstractfactory.BlackMaleHuman");

    private String value;

    HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
