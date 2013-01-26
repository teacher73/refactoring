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

public class EmployeeBefore {
	private int type;
	private int monthlySalary=200;
	private int commission=10;
	private int bonus=30;
	
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	EmployeeBefore(int type){
		this.type = type;
	}
	
	int payAmount(){
		switch( getType()){
		case ENGINEER:
			return monthlySalary;
		case SALESMAN:
			return monthlySalary + commission;
		case MANAGER:
			return monthlySalary + bonus;
		default:
			throw new IllegalArgumentException("사원이 잘못됨");
		}
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	
	
}
