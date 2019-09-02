package com.yydcyy.design.pattern.creational.singleton;

/**
 * @author YYDCYY
 * @create 2019-09-02
 * Effective Java 推荐的 枚举单例模式
 */
public enum EnumInstance {
    INSTANCE{
        protected void printTest(){
            System.out.println("YY Print Test.");
        }
    };

    private Object data;
    public Object getDate(){
        return data;
    }

    public void setData(Object data){
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
