package cn.yydcyy.design._3behaviour._7Observer;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserve(Observer o);
    void notifyObserver();
}
