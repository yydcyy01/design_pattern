package cn.yydcyy.design._3behaviour._2Command;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class Invoker {
    private Command[] onCommands;
    private Command[] offCommands;
    private final int slotNum = 7;

    /**
     * 空参构造器
     * 初始化
     */
    public Invoker() {
        this.onCommands = new Command[slotNum];
        this.offCommands = new Command[slotNum];
    }

    public void setOnCommand(Command onCommand, int slot) {
        this.onCommands[slot] = onCommand;
    }

    public void setOffCommand(Command offCommand, int slot) {
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }
}
