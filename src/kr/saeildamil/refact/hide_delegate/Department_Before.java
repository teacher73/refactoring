package kr.saeildamil.refact.hide_delegate;

public class Department_Before {
	private String _chargeCode;
	private Person_Before _manager;
	
	public Department_Before(Person_Before _manager) {
		this._manager = _manager;
	}

	public Person_Before get_manager() {
		return _manager;
	}
	
}
