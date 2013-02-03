/**
 *
 * @package		: kr.saeildamil.refact.conditional
 * @FileName	: Decompose_Conditional_Test.java
 * @Date  		: 2013. 2. 3.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.conditional;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @author	mskim
 * @since	2013. 2. 3. 오전 11:37:09
 * @version	1.0.0
 */

public class Decompose_Conditional_Test extends TestCase{


	public Decompose_Conditional_Test(String name) {
		super(name);
	}	
	
	public void testSubclass(){
		Decompose_Conditional dc = new Decompose_Conditional("2013/07/01");
		dc.cal();
		
		Decompose_Conditional dc2 = new Decompose_Conditional("2013/04/01");
		dc2.cal();
		
		Assert.assertEquals("여름",175.5, dc.getCharge());
		Assert.assertEquals("겨울",224.5, dc2.getCharge());
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(new TestSuite(Decompose_Conditional_Test.class));
	}
}
