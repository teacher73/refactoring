/**
 *
 * @package		: kr.saeildamil.refact.replace_subclass_with_fields
 * @FileName	: ReplaceSubclassWithFieldsTester.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.replace_subclass_with_fields.after;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 3:16:28
 * @version	1.0.0
 */

public class ReplaceSubclassWithFieldsTester extends TestCase {

	public ReplaceSubclassWithFieldsTester(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void testCaseOne(){
		Person kent = Person.createMale();
		Person taehee = Person.createFemale();
		
		Assert.assertEquals(true, kent.isMale());
		Assert.assertEquals(false, taehee.isMale());
		
		Assert.assertEquals('M', kent.getCode());
		assertEquals('F', taehee.getCode());
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(new TestSuite(ReplaceSubclassWithFieldsTester.class));
	}//end of main
}
