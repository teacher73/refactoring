/**
 *
 * @package		: kr.saeildamil.refact.replace_subclass_with_fields.after
 * @FileName	: Person.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.replace_subclass_with_fields.after;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 3:29:12
 * @version	1.0.0
 */

public class Person {
	private final boolean isMale;
	private final char code;
	
	protected Person(boolean isMale, char code) {
		this.isMale = isMale;
		this.code = code;
	}
	
	static Person createMale(){
		return new Male();
	}
	static Person createFemale(){
		return new Female();
	}
	boolean isMale(){
		return isMale;
	}

	/**
	 * @return the code
	 */
	public char getCode() {
		return code;
	}
}
