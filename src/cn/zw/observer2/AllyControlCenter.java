package cn.zw.observer2;

import java.util.ArrayList;
import java.util.List;

public abstract class AllyControlCenter {

	protected String allyName; // 战队名称

	protected List<Observer> plays = new ArrayList<Observer>();

	public void setAllyName(String name) {
		this.allyName = name;
	}

	public String getAllyName() {
		return allyName;
	}

	public void join(Observer obs) {
		System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
		plays.add(obs);
	}

	public void quit(Observer obs) {
		System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
		plays.remove(obs);
	}

	public abstract void notifyObserver(String name);

}
