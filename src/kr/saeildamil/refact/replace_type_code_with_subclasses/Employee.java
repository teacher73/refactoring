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

public abstract class Employee {
	private int type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	static Employee create(int type){
		switch(type){
		case ENGINEER : return new Engineer();
		case SALESMAN :return new Salesman();
		case MANAGER : return new Manager();
		default :
			throw new IllegalArgumentException("분류 부호 값이 잘못됨");
		}
	}

	abstract public int getType(); 
}
