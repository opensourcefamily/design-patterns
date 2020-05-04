package com.studyinghome.singleton;

/**
 * 单例模式-饿汉式
 *
 * @author Leslie (panxiang_work@163.com)
 * @website https://www.studyinghome.com
 * @create 2020-05-04 上午 11:12
 */
public class HungrySingleton implements Singelton {
    private static final long serialVersionUID = 42L;

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }

    /**
     * 防止通过反射方式创建新的对象
     */
    private HungrySingleton() {
        if (instance != null) {
            throw new IllegalAccessError("Cannot reflectively create singleton objects");
        }
    }

    @Override
    public Object readResolve() {
        return instance;
    }
}
