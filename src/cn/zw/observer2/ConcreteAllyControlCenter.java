package cn.zw.observer2;

public class ConcreteAllyControlCenter extends AllyControlCenter {

	public ConcreteAllyControlCenter(String allyName) {
		System.out.println(allyName + "战队组建成功！");
		System.out.println("===========================");
		this.allyName = allyName;
	}

	@Override
	public void notifyObserver(String name) {
		System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击!");
		for (Observer observer : plays) {
			if (!observer.getName().equals(name)) {
				observer.help();
			}
		}

	}

}
