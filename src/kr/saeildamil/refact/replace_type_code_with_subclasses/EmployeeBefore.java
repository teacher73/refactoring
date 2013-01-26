/**
 *
 * @package		: kr.saeildamil.refact.replace_type_code_with_subclasses
 * @FileName	: Employee.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.replace_type_code_with_subclasses;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 1:38:10
 * @version	1.0.0
 */

public class EmployeeBefore {
	private int type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	EmployeeBefore(int type){
		this.type = type;
	}

}
