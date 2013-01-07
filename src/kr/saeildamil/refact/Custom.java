package kr.saeildamil.refact;
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
		Iterator<Order> e = _orders.iterator();
		double outstanding = 0.0;
		//��� ���
		System.out.println("********************");
		System.out.println("****** �? �ܻ� ******");
		System.out.println("********************");
		
		//�ܻ�� ���
		while(e.hasNext()){
			Order order = e.next();
			outstanding += order.getAmount();
		}
		
		//���� ���� ���
		System.out.println("�?�� : " + _name);
		System.out.println("�� �ܻ�� : " + outstanding);
	}
}
