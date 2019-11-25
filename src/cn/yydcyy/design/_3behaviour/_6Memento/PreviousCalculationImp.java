package cn.yydcyy.design._3behaviour._6Memento;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class PreviousCalculationImp implements PreviousCalculationToCareTaker, PreviousCalculationToOriginator{
    private int firstNumber;
    private int secondNumber;

    //构造器

    public PreviousCalculationImp(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int getFirstNumber() {
        return firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return secondNumber;
    }
}
