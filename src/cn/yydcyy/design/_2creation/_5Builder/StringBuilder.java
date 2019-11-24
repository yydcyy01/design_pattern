package cn.yydcyy.design._2creation._5Builder;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class StringBuilder extends AbstractStringBuilder{
    /**
     * 构造器
     * 初始容量 16
     * @param
     */
    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        //create a copy, don't share the array
        return new String(value, 0, count);
    }
}
