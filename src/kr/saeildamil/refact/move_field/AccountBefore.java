package kr.saeildamil.refact.move_field;

public class AccountBefore {
	private AccountTypeBefore _type;
	private int _daysOverdrawn;
	private double _interestRate;
	
	double interestForAmount_days(double amount, int days){
		return _interestRate * amount * days / 365;
	}
	
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
