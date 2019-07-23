package cn.lweizhou.command.demo3;

/**
 * @Description: 传递命令对象的Invoker   小爱同学
 * @Author:fei-long-zhang
 * @Date:2019/7/23 23:09
 **/
public class XiaoAi {


    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * @Author fei-long-zhang
     * @Description 执行命令
     * @Date 23:10 2019/7/23
     * @Param []
     * @return 
     **/      
    
    public void doCommand(){
        command.execute();
    }
}