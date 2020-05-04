package com.studyinghome.singleton;

/**
 * 单例模式-懒汉式
 *
 * @author Leslie (panxiang_work@163.com)
 * @website https://www.studyinghome.com
 * @create 2020-05-04 下午 12:43
 */
public class LazySingleton implements Singelton {
    private static final long serialVersionUID = 42L;

    /**
     * 使用 volatile 防止jvm指令重排造成空对象的影响
     */
    private volatile static LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            //synchronized 保证线程安全
            synchronized (LazySingleton.class) {
                //双重验证
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    /**
     * 修改私有构造器防止反射方式创建对象
     */
    private LazySingleton() {
        if (instance != null) {
            throw new IllegalAccessError("Cannot reflectively create singleton objects");
        }
    }

    @Override
    public Object readResolve() {
        return instance;
    }
}
