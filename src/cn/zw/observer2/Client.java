package cn.zw.observer2;

public class Client {

	public static void main(String[] args) {
		AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群英传");
		
		Observer p1,p2,p3,p4;
		
		p1 = new Player();
		p1.setName("杨过");
		acc.join(p1);
		
		p2 = new Player();
		p2.setName("令狐冲");
		acc.join(p2);
		
		p3 = new Player();
		p3.setName("张无忌");
		acc.join(p3);
		
		p4 = new Player();
		p4.setName("段誉");
		acc.join(p4);
		
		p1.beAttacked(acc);
	}
	
	
}
