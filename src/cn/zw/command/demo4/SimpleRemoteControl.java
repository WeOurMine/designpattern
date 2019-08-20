package cn.zw.command.demo4;

/**
 * 调用者 Invoker
 */
public class SimpleRemoteControl {

    Command solat;


    public SimpleRemoteControl() {


    }

    public void setCommand(Command command){
        solat = command;
    }


    public void buttonWasPressed(){
        solat.execute();
    }
}
