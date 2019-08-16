package cn.zw.command.demo2;

public class HelpCommand extends Command {
	private HelpHandler helpHandler; // 维持对请求接收者的引用

	public HelpCommand() {
		helpHandler = new HelpHandler();
	}

	// 命令执行方法，将调用请求接收者的业务方法
	@Override
	public void execute() {
		helpHandler.display();
	}
}
