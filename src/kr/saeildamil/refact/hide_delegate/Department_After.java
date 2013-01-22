package kr.saeildamil.refact.hide_delegate;

public class Department_After {
	private String _chargeCode;
	private Person_After _manager;
	
	public Department_After(Person_After _manager) {
		this._manager = _manager;
	}

	public Person_After get_manager() {
		return _manager;
	}
	
}
