package com.soft.java.annotation;

import java.lang.reflect.Method;

public class CallMyTest {
    public static void main(String[] args)throws Exception{
        Class<?> c=MyTestTarget.class;
        Method[] methods = c.getMethods();
        Object obj = c.getDeclaredConstructor().newInstance();
        for(Method m:methods){
            if(m.isAnnotationPresent(MyTest.class)){
                m.invoke(obj);
            }
        }
    }
}
