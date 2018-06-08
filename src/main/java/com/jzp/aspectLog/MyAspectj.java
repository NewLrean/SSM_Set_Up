package com.jzp.aspectLog;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by 蒋志鹏 on 2018/6/7.
 */
public class MyAspectj {
    public void before(){
        System.out.println("前置增强===========");
    }

    public void saveLog(){
        System.out.println("保存日志");
    }

    public void trans(ProceedingJoinPoint joinPoint){
        System.out.println("开启事务");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("提交事务");
    }
}
