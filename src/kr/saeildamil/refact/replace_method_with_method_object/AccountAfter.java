package kr.saeildamil.refact.replace_method_with_method_object;

class Gamma{
	private final AccountAfter _account;
	private int inputVal;
	private int quantity;
	private int yearToDate;
	private int importantValue1;
	private int importantValue2;
	private int importantValue3;
	
	public Gamma(AccountAfter _account, int inputVal, int quantity,	int yearToDate) {
		this._account = _account;
		this.inputVal = inputVal;
		this.quantity = quantity;
		this.yearToDate = yearToDate;
	}
	
	int compute(){
		importantValue1 = (inputVal * quantity) + _account.delta();
		importantValue2 = (inputVal * yearToDate) + 100;
		importantThing();
		int importantValue3 = importantValue2 * 7;
		return importantValue3 - 2 * importantValue1;
	}

	private void importantThing() {
		if ((yearToDate - importantValue1)>100)
			importantValue2 -= 20;		
	}
	
}

public class AccountAfter {
	int gamma(int inputVal, int quantity, int yearToDate){
		return new Gamma(this, inputVal, quantity, yearToDate).compute();
	}

	public int delta() {
		return 0;
	}
}
