package kr.saeildamil.refact.extract_class;

public class PersonAfter {
	private String _name;
	
	
	private TelphoneNumber _officeTelphone = new TelphoneNumber();
	
	public String getTelephoneNumber(){
		return ("(" + _officeTelphone.get_areaCode() + ")" + _officeTelphone.get_number());
	}
	
	public String get_name() {
		return _name;
	}
		
}
