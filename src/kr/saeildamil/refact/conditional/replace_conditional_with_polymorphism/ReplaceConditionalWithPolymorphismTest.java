/**
 *
 * @package		: kr.saeildamil.refact.conditional.replace_conditional_with_polymorphism
 * @FileName	: ReplaceConditionalWithPolymorphismTest.java
 * @Date  		: 2013. 2. 3.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.conditional.replace_conditional_with_polymorphism;


import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Before;

/**
 * 
 * @author	mskim
 * @since	2013. 2. 3. 오후 1:32:04
 * @version	1.0.0
 */

public class ReplaceConditionalWithPolymorphismTest extends TestCase {
	private Employee empENG;
	private Employee empMGN;
	private Employee empSALES;
	
	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	protected void setUp() throws Exception {
		empENG = new Employee(EmployeeType.ENGINEER);
		empMGN = new Employee(EmployeeType.MANAGER);
		empSALES = new Employee(EmployeeType.SALESMAN);
	}
	
	public void testEmployee(){
		Assert.assertEquals(200, empENG.payAmount());
		Assert.assertEquals(210, empSALES.payAmount());
		Assert.assertEquals(230, empMGN.payAmount());
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(new TestSuite(ReplaceConditionalWithPolymorphismTest.class));
	}//end of main
}
