package cn.zw.command.demo2;

public class TestCommand {

	public static void main(String[] args) {

		FBSettingWindow fbsw = new FBSettingWindow("功能键设置");

		FunctionButton fb1 = new FunctionButton("最小化窗口");
		FunctionButton fb2 = new FunctionButton("帮助窗口");
		fb1.setCommand(new MinimizeCommand());
		fb2.setCommand(new HelpCommand());

		fbsw.addFunctionButton(fb1);
		fbsw.addFunctionButton(fb2);
		fbsw.display();

		fb1.onClick();
		fb2.onClick();
	}

}
