package cn.zw.observer2;

public interface Observer {

	public String getName();

	public void setName(String name);
	
	public void help(); //生命支援盟友的方法
	
	public void beAttacked(AllyControlCenter acc); //声明遭受攻击的方法
}
