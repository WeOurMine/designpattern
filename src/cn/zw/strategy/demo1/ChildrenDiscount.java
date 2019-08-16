package cn.zw.strategy.demo1;

public class ChildrenDiscount implements DisCount {

	@Override
	public double calculate(double price) {
		
		return price - 10;
	}

}
