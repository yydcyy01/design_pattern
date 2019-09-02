package com.yydcyy.design.pattern.creational.singleton;

/**
 * @author YYDCYY
 * @create 2019-09-02
 */
public class ThreadLocalInstance {
    private ThreadLocalInstance(){}
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal = new ThreadLocal<ThreadLocalInstance>(){
    //    @Override
        protected ThreadLocalInstance initialValue(){
            return new ThreadLocalInstance();
        }
    };
    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }

}
