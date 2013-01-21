package kr.saeildamil.refact.move_method;

public class AccountAfter {
	private AccountTypeAfter _type;
	private int _daysOverdrawn;
	
	double overdraftCharge(){
		return _type.overdraftCharge(_daysOverdrawn);
	}
	
	double bankChare(){
		double result = 4.5;
		if (_daysOverdrawn > 0) result += _type.overdraftCharge(_daysOverdrawn);
		return result;
	}

	public int get_daysOverdrawn() {
		return _daysOverdrawn;
	}
	
	
}
