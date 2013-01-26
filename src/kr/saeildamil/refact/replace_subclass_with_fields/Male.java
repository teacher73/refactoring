/**
 *
 * @package		: kr.saeildamil.refact.replace_subclass_with_fields
 * @FileName	: Male.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.replace_subclass_with_fields;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 3:15:02
 * @version	1.0.0
 */

public class Male extends Person {

	/**
	 * @see kr.saeildamil.refact.replace_subclass_with_fields.Person#isMale()
	 */
	@Override
	boolean isMale() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * @see kr.saeildamil.refact.replace_subclass_with_fields.Person#getCode()
	 */
	@Override
	char getCode() {
		// TODO Auto-generated method stub
		return 'M';
	}

}
