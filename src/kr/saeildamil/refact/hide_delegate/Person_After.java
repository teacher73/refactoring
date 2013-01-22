package kr.saeildamil.refact.hide_delegate;

public class Person_After {
	private String _name;
	Department_After _department;

	
	public Person_After(String _name) {
		this._name = _name;
	}

	public void set_department(Department_After _department) {
		this._department = _department;
	}
	
	public Person_After getManager(){
		return _department.get_manager();
	}

	@Override
	public String toString() {
		return "Person_Before [_name=" + _name + "]";
	}
	
	
}
