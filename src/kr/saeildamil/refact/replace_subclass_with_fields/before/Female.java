/**
 *
 * @package		: kr.saeildamil.refact.replace_subclass_with_fields
 * @FileName	: Female.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.replace_subclass_with_fields.before;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 3:15:32
 * @version	1.0.0
 */

public class Female extends Person {

	/**
	 * @see kr.saeildamil.refact.replace_subclass_with_fields.before.Person#isMale()
	 */
	@Override
	boolean isMale() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see kr.saeildamil.refact.replace_subclass_with_fields.before.Person#getCode()
	 */
	@Override
	char getCode() {
		// TODO Auto-generated method stub
		return 'F';
	}

}
