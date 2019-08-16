package cn.zw.command.demo2;

//最小化命令类：具体命令类
public class MinimizeCommand extends Command {

	private WindowHanlder wbHandler;

	public MinimizeCommand() {
		wbHandler = new WindowHanlder();
	}

	// 命令执行方法，将调用请求接受者的业务方法
	@Override
	public void execute() {

		wbHandler.minimize();

	}

}
