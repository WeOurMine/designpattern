package cn.zw.command.demo3;

/**
 * @Description:客户端对象
 * @Author:fei-long-zhang
 * @Date:2019/7/23 23:16
 **/
public class Client {

    public static void main(String[] args) {
        //创建小爱同学
        XiaoAi xiaoAi = new XiaoAi();
        //创建具体的灯对象，相当于具体的命令的接受者
        Light light = new Light();

        System.out.println("小爱同学帮我把灯开一下！");

        ConcreteCommand.LightOnCommand lightOnCommand = new ConcreteCommand().new LightOnCommand(light);

        //小爱同学接受到了你发出的命令，并执行命令
        xiaoAi.setCommand(lightOnCommand);

        xiaoAi.doCommand();

    }
}