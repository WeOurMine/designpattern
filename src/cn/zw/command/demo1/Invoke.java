package cn.zw.command.demo1;

public class Invoke {

	private Command command;

	// 构造注入
	public Invoke(Command command) {

		this.command = command;
	}

	// set注入
	public void setCommand(Command command) {
		
		this.command = command;
	}

	public void call() {
		
		command.execute();
	}

}
