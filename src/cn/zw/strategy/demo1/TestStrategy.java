package cn.zw.strategy.demo1;

public class TestStrategy {
	
	
	public static void main(String[] args) {
		DisCount disCount = new StudentDisCount();
		
		movieTicket m = new movieTicket(disCount);
		m.setPrice(112);
		System.out.println(m.getPrice());
	}

}
