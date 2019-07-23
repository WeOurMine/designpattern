package cn.lweizhou.command.demo3;

/**
 * @Description:具体的命令对象
 * @Author:fei-long-zhang
 * @Date:2019/7/23 23:03
 **/
public class ConcreteCommand {

    //开灯命令
    public class LightOnCommand implements Command {

        private Light light;

        //创建开灯命令的时候，传入具体的灯对象，由灯对象操作自己
        public LightOnCommand(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.lightOn();
        }
    }

    //开灯命令
    public class LightOffCommand implements Command {

        private Light light;

        //创建开灯命令的时候，传入具体的灯对象，由灯对象操作自己
        public LightOffCommand(Light light) {
            this.light = light;
        }

        //具体的灯对象调用自己的关灯方法
        @Override
        public void execute() {
            light.lightOff();
        }
    }


}