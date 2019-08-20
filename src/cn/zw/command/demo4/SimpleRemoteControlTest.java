package cn.zw.command.demo4;

/**
 * 客户端 Client
 */

public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl  remote = new SimpleRemoteControl();
        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);

        remote.buttonWasPressed();
    }
}
