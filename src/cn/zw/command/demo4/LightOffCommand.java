package cn.zw.command.demo4;

/**
 * 具体命令
 */
public class LightOffCommand  implements Command {

    Light light;


    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {

        light.off();
    }

    @Override
    public void undo() {

    }
}
