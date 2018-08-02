package com.studyinghome.abstractfactory;

/**
 * 定一个接口，要造不同性别的人，需要不同的生产线
 *
 * @author leslie
 * @create 2018-08-02 16:12
 */
public interface HumanFactory {
    //制造黄色人类
    Human createYellowHuman();

    //制造一个白色人类
    Human createWhiteHuman();

    //制造一个黑色人类
    Human createBlackHuman();
}
