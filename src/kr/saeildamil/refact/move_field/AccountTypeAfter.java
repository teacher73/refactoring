package kr.saeildamil.refact.move_field;

public class AccountTypeAfter {
	private double _interestRate;
	
	public double get_interestRate() {
		return _interestRate;
	}

	public void set_interestRate(double _interestRate) {
		this._interestRate = _interestRate;
	}

	public boolean isPremium() {
		return false;
	}
		
	double overdraftCharge(int daysOverdrawn){
		//AccountTypeAfter가 daysOverdrawn만 참조할 경우
		if (isPremium()){
			double result = 10;
			if (daysOverdrawn > 7) result +=(daysOverdrawn-7) *0.85;
			return result;
		}else{
			return daysOverdrawn * 1.75;
		}
	}
	
	double overdraftCharge(AccountBefore account){
		//AccountTypeAfter가 다른 AccountAfter메소드를 참조할 경우
		if (isPremium()){
			double result = 10;
			if (account.get_daysOverdrawn() > 7) result +=(account.get_daysOverdrawn()-7) *0.85;
			return result;
		}else{
			return account.get_daysOverdrawn() * 1.75;
		}
	}
}
