/**
 *
 * @package		: kr.saeildamil.refact.replace_subclass_with_fields
 * @FileName	: ReplaceSubclassWithFieldsTester.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.replace_subclass_with_fields;

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
	public void testCase(){
		Male male = new Male();
		Female female = new Female();
		
		Assert.assertEquals(true, male.isMale());
		Assert.assertEquals(false, female.isMale());
		
		Assert.assertEquals('M', male.getCode());
		Assert.assertEquals('F', female.getCode());
	}
	public static void main(String[] args) {
		junit.textui.TestRunner.run(new TestSuite(ReplaceSubclassWithFieldsTester.class));
	}//end of main
}
