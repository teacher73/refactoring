package kr.saeildamil.refact.replace_temp_with_query;

public class Order {
	private double amount;	//�ܻ��
	private String orderDate;	//�ܻ�¥
	private String orderName;	//�ܻ� ǰ��
	private int orderNum;
	
	public Order() { }	
	
	public Order(double amount, String orderDate, String orderName, int orderNum) {
		this.amount = amount;
		this.orderDate = orderDate;
		this.orderName = orderName;
		this.orderNum = orderNum;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

}
