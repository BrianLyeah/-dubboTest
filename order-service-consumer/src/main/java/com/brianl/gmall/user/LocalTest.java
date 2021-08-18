package com.brianl.gmall.user;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-05-28 10:00
 */
public class LocalTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        UserA a = new UserA("锁A");
        UserA b = new UserA("锁B");

        LockThread t1 = new LockThread(a, b);
        t1.setName("t1");
        LockThread t2 = new LockThread(b, a);
        t2.setName("t2");

        t1.start();
        t2.start();

        /*Class<?> aClass = Class.forName("com.brianl.gmall.user.UserA");
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-------------------");
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-------------------");
        Constructor<?>[] constructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }


        UserA userA = (UserA)aClass.newInstance();
        userA.setAge(18);
        userA.setName("张三");
        Method msg = aClass.getMethod("msg");
        Object invoke = msg.invoke(userA);
        System.out.println(invoke);
        Method age = aClass.getMethod("getAge");
        Object invoke1 = age.invoke(userA);
        System.out.println(invoke1);*/


    }
}
