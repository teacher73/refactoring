package kr.saeildamil.refact.move_field;

public class AccountAfter {
	private AccountTypeAfter _type;
	private int _daysOverdrawn;
	//많은 메소드가 interestRate 필드를 필요로 한다면 필드자체를 캡슐화
	private double _interestRate;
	
	public double get_interestRate() {
		return _type.get_interestRate();
	}

	public void set_interestRate(double _interestRate) {
		_type.set_interestRate(_interestRate);
	}

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
