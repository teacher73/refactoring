package kr.saeildamil.refact.extract_class;

public class PersonBefore {
	private String _name;
	private String _officeAreaCode;
	private String _officeNumber;
	
	public String getTelephoneNumber(){
		return ("(" + _officeAreaCode + ")" + _officeNumber);
	}
	
	public String get_officeAreaCode() {
		return _officeAreaCode;
	}
	public void set_officeAreaCode(String _officeAreaCode) {
		this._officeAreaCode = _officeAreaCode;
	}
	public String get_officeNumber() {
		return _officeNumber;
	}
	public void set_officeNumber(String _officeNumber) {
		this._officeNumber = _officeNumber;
	}
	public String get_name() {
		return _name;
	}
		
}
