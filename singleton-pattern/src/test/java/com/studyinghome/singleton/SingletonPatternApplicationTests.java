package com.studyinghome.singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.lang.reflect.Constructor;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SingletonPatternApplicationTests {

    @Test
    public void threadTest() {
        //测试多线程情况下创建的是否是同一对象
        new Thread(() -> {
//            HungrySingleton singleton = HungrySingleton.getInstance();
//            LazySingleton singleton = LazySingleton.getInstance();
//            EnumSingleton singleton = EnumSingleton.INSTANCE;
            InnerclassSingleton singleton = InnerclassSingleton.getInstance();
            System.out.println(singleton);
        }).start();
        new Thread(() -> {
//            HungrySingleton singleton = HungrySingleton.getInstance();
//            LazySingleton singleton = LazySingleton.getInstance();
//            EnumSingleton singleton = EnumSingleton.INSTANCE;
            InnerclassSingleton singleton = InnerclassSingleton.getInstance();
            System.out.println(singleton);
        }).start();
        new Thread(() -> {
//            HungrySingleton singleton = HungrySingleton.getInstance();
//            LazySingleton singleton = LazySingleton.getInstance();
//            EnumSingleton singleton = EnumSingleton.INSTANCE;
            InnerclassSingleton singleton = InnerclassSingleton.getInstance();
            System.out.println(singleton);
        }).start();
    }

    @Test
    public void reflectTest() throws Exception {
        //通过反射方式创建对象
        //饿汉式
//        HungrySingleton singleton = HungrySingleton.getInstance();

//        Constructor<HungrySingleton> constructor = HungrySingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton hungrySingleton = constructor.newInstance();

        //比较反射创建的对象和正常方式获得的对象是否一样
//        System.out.println(hungrySingleton == singleton);

        //懒汉式
//        LazySingleton singleton = LazySingleton.getInstance();
//
//        Constructor<LazySingleton> constructor = LazySingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        LazySingleton lazySingleton = constructor.newInstance();
//        System.out.println(lazySingleton == singleton);


        //枚举
//        EnumSingleton singleton = EnumSingleton.INSTANCE;

//        Constructor<EnumSingleton> constructor = EnumSingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        EnumSingleton enumSingleton = constructor.newInstance();
//        System.out.println(enumSingleton == singleton);

        //静态内部类
        InnerclassSingleton singleton = InnerclassSingleton.getInstance();

        Constructor<InnerclassSingleton> constructor = InnerclassSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        InnerclassSingleton innerclassSingleton = constructor.newInstance();
        System.out.println(singleton == innerclassSingleton);
    }

    @Test
    public void streamTest() throws Exception {
        //测试序列化和反序列化
        //懒加载
//        LazySingleton singleton = LazySingleton.getInstance();

        //静态内部类
        InnerclassSingleton singleton = InnerclassSingleton.getInstance();

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
//        oos.writeObject(singleton);
//        oos.close();
//
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
        //懒加载
//        LazySingleton lazySingleton = (LazySingleton) ois.readObject();
//        System.out.println(singleton == lazySingleton);

        //静态内部类
        InnerclassSingleton innerclassSingleton = (InnerclassSingleton) ois.readObject();
        System.out.println(singleton == innerclassSingleton);
    }
}
