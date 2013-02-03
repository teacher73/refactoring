/**
 *
 * @package		: kr.saeildamil.refact.replace_type_code_with_state_strategy
 * @FileName	: Manager.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.conditional.replace_conditional_with_polymorphism;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 2:27:32
 * @version	1.0.0
 */

public class Manager extends EmployeeType {

	/**
	 * @see kr.saeildamil.refact.replace_type_code_with_state_strategy.EmployeeAfterType#getTypeCode()
	 */
	@Override
	int getTypeCode() {
		// TODO Auto-generated method stub
		return EmployeeType.MANAGER;
	}

	/**
	 * @see kr.saeildamil.refact.conditional.replace_conditional_with_polymorphism.EmployeeType#payAmount(kr.saeildamil.refact.conditional.replace_conditional_with_polymorphism.Employee)
	 */
	@Override
	int payAmount(Employee emp) {
		return emp.getMonthlySalary() + emp.getBonus();
	}

}
