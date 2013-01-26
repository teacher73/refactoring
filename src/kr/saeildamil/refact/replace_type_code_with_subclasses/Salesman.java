/**
 *
 * @package		: kr.saeildamil.refact.replace_type_code_with_subclasses
 * @FileName	: Salesman.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.replace_type_code_with_subclasses;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 1:51:37
 * @version	1.0.0
 */

public class Salesman extends Employee {

	/**
	 * @see kr.saeildamil.refact.replace_type_code_with_subclasses.Employee#getType()
	 */
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return Employee.SALESMAN;
	}

}
