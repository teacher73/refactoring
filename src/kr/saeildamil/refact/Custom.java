package kr.saeildamil.refact;
import java.util.ArrayList;
import java.util.Iterator;

public class Custom {
	private String _name;					//고객이름
	private ArrayList<Order> _orders;	//외상리스트
	
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
		//배너 출력
		System.out.println("********************");
		System.out.println("****** 고객 외상 ******");
		System.out.println("********************");
		
		//외상액 계산
		while(e.hasNext()){
			Order order = e.next();
			outstanding += order.getAmount();
		}
		
		//세부 내역 출력
		System.out.println("고객명 : " + _name);
		System.out.println("총 외상액 : " + outstanding);
	}
}
