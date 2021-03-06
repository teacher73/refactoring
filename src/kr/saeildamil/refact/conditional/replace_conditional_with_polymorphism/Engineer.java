/**
 *
 * @package		: kr.saeildamil.refact.replace_type_code_with_state_strategy
 * @FileName	: Engineer.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.conditional.replace_conditional_with_polymorphism;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 2:26:20
 * @version	1.0.0
 */

public class Engineer extends EmployeeType {

	/**
	 * @see kr.saeildamil.refact.replace_type_code_with_state_strategy.EmployeeAfterType#getTypeCode()
	 */
	@Override
	int getTypeCode() {
		return EmployeeType.ENGINEER;
	}

	/**
	 * @see kr.saeildamil.refact.conditional.replace_conditional_with_polymorphism.EmployeeType#payAmount(kr.saeildamil.refact.conditional.replace_conditional_with_polymorphism.Employee)
	 */
	@Override
	int payAmount(Employee emp) {
		return emp.getMonthlySalary();
	}

}
