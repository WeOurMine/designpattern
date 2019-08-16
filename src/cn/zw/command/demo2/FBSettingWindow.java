package cn.zw.command.demo2;

import java.util.ArrayList;
import java.util.List;

public class FBSettingWindow {

	private String title;

	private List<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

	public FBSettingWindow(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void addFunctionButton(FunctionButton fb) {
		functionButtons.add(fb);
	}

	public void removeFunctionButton(FunctionButton fb) {
		functionButtons.remove(fb);
	}

	public void display() {
		System.out.println("显示窗口：" + this.title);
		System.out.println("显示功能键：");
		for (FunctionButton obj : functionButtons) {
			System.out.println(obj.getName());
		}
		System.out.println("------------------------------");
	}
}
