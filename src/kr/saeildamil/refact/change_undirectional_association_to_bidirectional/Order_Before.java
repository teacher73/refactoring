package kr.saeildamil.refact.change_undirectional_association_to_bidirectional;

public class Order_Before {
	Customer_Before _customer;
	
	Customer_Before getCustomer(){
		return _customer;
	}
	
	void setCustomer(Customer_Before arg){
		//다른 객체에 이 객체의 포인터를 제거
		if (_customer != null) _customer.friendOrders().remove(this);
		//이 객체의 포인터를 새 객체제 할당
		_customer = arg;
		//이 객체로의 포인터를 추가하게 새 객체에 명령
		if (_customer != null) _customer.friendOrders().add(this);
	}
}
