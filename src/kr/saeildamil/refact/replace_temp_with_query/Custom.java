package kr.saeildamil.refact.replace_temp_with_query;
import java.util.ArrayList;
import java.util.Iterator;

public class Custom {
	private String _name;					//�?�̸�
	private ArrayList<Order> _orders;	//�ܻ󸮽�Ʈ
	
	public Custom(String _name) {
		this._name = _name;
		this._orders = new ArrayList<>();
	}
	
	public String get_name() {
		return _name;
	}
	
	public void set_name(String _name) {
		this._name = _name;
	}
	
	public void addOrder(Order order){
		_orders.add(order);
	}

	void printOwing(){
		double outstanding = getOutstanding();
		//��� ���
		printBanner();
		//���� ���� ���
		printDetail(outstanding);
	}

	private double getOutstanding() {
		Iterator<Order> e = _orders.iterator();
		double result = 0.0;
			while(e.hasNext()){
				Order order = e.next();
				result += order.getAmount();
			}
		return result;
	}

	private void printDetail(double outstanding) {
		System.out.println("�?�� : " + _name);
		System.out.println("�� �ܻ�� : " + outstanding);		
	}

	private void printBanner() {
		System.out.println("********************");
		System.out.println("****** �? �ܻ� ******");
		System.out.println("********************");		
	}
}
