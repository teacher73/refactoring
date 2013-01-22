package kr.saeildamil.refact.hide_delegate;

public class Person_Before {
	private String _name;
	Department_Before _department;

	
	public Person_Before(String _name) {
		this._name = _name;
	}

	public Department_Before get_department() {
		return _department;
	}

	public void set_department(Department_Before _department) {
		this._department = _department;
	}

	@Override
	public String toString() {
		return "Person_Before [_name=" + _name + "]";
	}
	
	
}
