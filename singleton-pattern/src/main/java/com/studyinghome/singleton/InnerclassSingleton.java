package com.studyinghome.singleton;

/**
 * 单例模式-静态内部类
 * <p>
 * 没有绑定关系，而且只有被调用到时才会装载，从而实现延迟加载
 *
 * @author Leslie (panxiang_work@163.com)
 * @website https://www.studyinghome.com
 * @create 2020-05-04 下午 5:04
 */

public class InnerclassSingleton implements Singelton {
    private static final long serialVersionUID = 42L;

    private static class InnerSingleton {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static InnerclassSingleton instance = new InnerclassSingleton();

    }

    /**
     * 修改私有构造器防止反射方式创建对象
     */
    private InnerclassSingleton() {
        if (InnerSingleton.instance != null) {
            throw new IllegalAccessError("Cannot reflectively create singleton objects");
        }
    }

    public static InnerclassSingleton getInstance() {
        return InnerSingleton.instance;
    }

    @Override
    public Object readResolve() {
        return InnerSingleton.instance;
    }
}
