package cn.zw.strategy.demo1;

public class movieTicket {

	private double price;

	private DisCount disCount;

	public movieTicket(DisCount disCount) {
		this.disCount = disCount;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return disCount.calculate(price);
	}

}
