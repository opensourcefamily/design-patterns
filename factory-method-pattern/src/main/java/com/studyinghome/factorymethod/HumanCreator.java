package com.studyinghome.factorymethod;

/**
 * @author Leslie (panxiang_work@163.com)
 * @website https://www.studyinghome.com
 * @create 2020-05-04 下午 5:46
 */
public interface HumanCreator {
    /**
     * 创建Human的方法
     *
     * @param c
     * @return
     */
    Human createHuman(Class c);

}
