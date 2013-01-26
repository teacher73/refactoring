/**
 *
 * @package		: kr.saeildamil.refact.replace_type_code_with_state_strategy
 * @FileName	: Employee.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.replace_type_code_with_state_strategy;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 2:18:11
 * @version	1.0.0
 */

public class EmployeeAfter {
	private EmployeeAfterType type;
	private int monthlySalary=200;
	private int commission=10;
	private int bonus=30;
	
	EmployeeAfter(int type){
		setType(type);
		
	}
	
	/**
	 * @return the type
	 */
	public int getType() {
		return type.getTypeCode();
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int arg) {
		type = EmployeeAfterType.newType(arg);
	}

	int payAmount(){
		switch(getType()){
		case EmployeeAfterType.ENGINEER:
			return monthlySalary;
		case EmployeeAfterType.SALESMAN:
			return monthlySalary + commission;
		case EmployeeAfterType.MANAGER:
			return monthlySalary + bonus;
		default:
			throw new IllegalArgumentException("사원이 잘못됨");
		}
	}
}
