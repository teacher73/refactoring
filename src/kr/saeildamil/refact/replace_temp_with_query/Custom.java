package kr.saeildamil.refact.replace_temp_with_query;
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
		double outstanding = getOutstanding();
		//배너 출력
		printBanner();
		//세부 내역 출력
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
		System.out.println("고객명 : " + _name);
		System.out.println("총 외상액 : " + outstanding);		
	}

	private void printBanner() {
		System.out.println("********************");
		System.out.println("****** 고객 외상 ******");
		System.out.println("********************");		
	}
}

