package cn.zw.command.demo4;

public class LightOnCommand implements  Command {


    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {

        light.on();
    }

    @Override
    public void undo() {

    }
}
