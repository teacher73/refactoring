/**
 *
 * @package		: kr.saeildamil.refact.replace_type_code_with_state_strategy
 * @FileName	: Employee.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.conditional.replace_conditional_with_polymorphism;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 2:18:11
 * @version	1.0.0
 */

public class Employee {
	private EmployeeType type;
	private int monthlySalary=200;
	private int commission=10;
	private int bonus=30;
	
	Employee(int type){
		setType(type);
	}
	
	int payAmount(){
		return type.payAmount(this);
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
		type = EmployeeType.newType(arg);
	}

	/**
	 * @return the monthlySalary
	 */
	public int getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * @return the commission
	 */
	public int getCommission() {
		return commission;
	}

	/**
	 * @return the bonus
	 */
	public int getBonus() {
		return bonus;
	}

	
}
