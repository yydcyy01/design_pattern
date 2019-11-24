package cn.yydcyy.design._3behaviour._2Command;

/**
 * @author YYDCYY
 * @create 2019-11-24
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
