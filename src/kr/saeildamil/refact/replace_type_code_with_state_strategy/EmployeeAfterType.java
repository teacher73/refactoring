/**
 *
 * @package		: kr.saeildamil.refact.replace_type_code_with_state_strategy
 * @FileName	: EmployeeAfterType.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.replace_type_code_with_state_strategy;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 2:25:36
 * @version	1.0.0
 */

public abstract class EmployeeAfterType {
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	abstract int getTypeCode();
	
	static EmployeeAfterType newType(int code){
		switch(code){
		case ENGINEER: return new Engineer();
		case SALESMAN: return new Salesman();
		case MANAGER : return new Manager();
		default		: throw new IllegalArgumentException("사원 부호가 잘못됨");
		}
	}
}
