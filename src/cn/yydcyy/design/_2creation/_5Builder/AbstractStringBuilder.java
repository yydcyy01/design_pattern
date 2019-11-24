package cn.yydcyy.design._2creation._5Builder;

import java.util.Arrays;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class AbstractStringBuilder {

    protected char[] value;

    protected int count;

    /**
     构造器
     */
    public AbstractStringBuilder(int capacity) {
        count = 0;
        value = new char[capacity];
    }

    public AbstractStringBuilder append(char c){
        ensureCapacityInternal(count + 1);
        //赋值
        value[count ++] = c;
        return this;
    }

    private void ensureCapacityInternal(int minimumCapacity){
        if (minimumCapacity - value.length > 0)
            expendCapacity(minimumCapacity);

    }

    /**
     * 扩容
     * @param minimumCapacity
     */
    void expendCapacity(int minimumCapacity){
        int newCapacity = value.length * 2 + 2;
        if (newCapacity - minimumCapacity < 0)
            newCapacity = minimumCapacity;

        //overflow : 超出最大值, capacity 赋为最大值
        if (newCapacity < 0) {
            if (minimumCapacity < 0) // overflow
                throw new OutOfMemoryError();

            newCapacity = Integer.MAX_VALUE;
        }

        value = Arrays.copyOf(value, newCapacity);
    }
}
