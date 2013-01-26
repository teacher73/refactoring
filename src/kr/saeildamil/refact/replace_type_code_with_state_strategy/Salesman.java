/**
 *
 * @package		: kr.saeildamil.refact.replace_type_code_with_state_strategy
 * @FileName	: Salesman.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.replace_type_code_with_state_strategy;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 2:27:05
 * @version	1.0.0
 */

public class Salesman extends EmployeeAfterType {

	/**
	 * @see kr.saeildamil.refact.replace_type_code_with_state_strategy.EmployeeAfterType#getTypeCode()
	 */
	@Override
	int getTypeCode() {
		// TODO Auto-generated method stub
		return EmployeeAfterType.SALESMAN;
	}

}
