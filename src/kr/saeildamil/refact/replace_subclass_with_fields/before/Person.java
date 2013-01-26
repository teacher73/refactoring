/**
 *
 * @package		: kr.saeildamil.refact.replace_subclass_with_fields
 * @FileName	: Person.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.replace_subclass_with_fields.before;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 3:14:10
 * @version	1.0.0
 */

public abstract class Person {
	abstract boolean isMale();
	abstract char getCode();
}
