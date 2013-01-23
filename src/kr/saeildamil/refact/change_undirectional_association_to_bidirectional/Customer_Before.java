package kr.saeildamil.refact.change_undirectional_association_to_bidirectional;

import java.util.HashSet;
import java.util.Set;

public class Customer_Before {
	private Set _orders = new HashSet<>();
	
	Set friendOrders(){
		return _orders;
	}
	
	void addOrder(Order_Before arg){
		arg.setCustomer(this);
	}
}
