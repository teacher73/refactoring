/**
 *
 * @package		: kr.saeildamil.refact.replace_type_code_with_state_strategy
 * @FileName	: ReplaceTypeCodeWithStateStrategyTester.java
 * @Date  		: 2013. 1. 26.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.replace_type_code_with_state_strategy;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 26. 오후 2:29:05
 * @version	1.0.0
 */

public class ReplaceTypeCodeWithStateStrategyTester extends TestCase {

	public ReplaceTypeCodeWithStateStrategyTester(String name) {
		super(name);
	}
	
	public void testBeforeOneSubclass(){
		EmployeeBefore obj1 = new EmployeeBefore(EmployeeBefore.ENGINEER);
		EmployeeBefore obj2 = new EmployeeBefore(EmployeeBefore.SALESMAN);
		EmployeeBefore obj3 = new EmployeeBefore(EmployeeBefore.MANAGER);
		Assert.assertEquals(200, obj1.payAmount());
		Assert.assertEquals(210, obj2.payAmount());
		Assert.assertEquals(230, obj3.payAmount());
	}
	public void testBeforeTwoSubclass(){
		EmployeeBefore obj1 = new EmployeeBefore(EmployeeBefore.ENGINEER);
		EmployeeBefore obj2 = new EmployeeBefore(EmployeeBefore.SALESMAN);
		EmployeeBefore obj3 = new EmployeeBefore(EmployeeBefore.MANAGER);
		obj1.setType(EmployeeBefore.SALESMAN);
		obj2.setType(EmployeeBefore.MANAGER);
		obj3.setType(EmployeeBefore.ENGINEER);
		Assert.assertEquals(210, obj1.payAmount());
		Assert.assertEquals(230, obj2.payAmount());
		Assert.assertEquals(200, obj3.payAmount());
	}
	public void testAfterOneSubclass(){
		EmployeeAfter obj1 = new EmployeeAfter(EmployeeAfterType.ENGINEER);
		EmployeeAfter obj2 = new EmployeeAfter(EmployeeAfterType.SALESMAN);
		EmployeeAfter obj3 = new EmployeeAfter(EmployeeAfterType.MANAGER);
		Assert.assertEquals(200, obj1.payAmount());
		Assert.assertEquals(210, obj2.payAmount());
		Assert.assertEquals(230, obj3.payAmount());
	}
	
	public void testAfterTwoSubclass(){
		EmployeeAfter obj1 = new EmployeeAfter(EmployeeAfterType.ENGINEER);
		EmployeeAfter obj2 = new EmployeeAfter(EmployeeAfterType.SALESMAN);
		EmployeeAfter obj3 = new EmployeeAfter(EmployeeAfterType.MANAGER);
		
		obj1.setType(EmployeeAfterType.SALESMAN);
		obj2.setType(EmployeeAfterType.MANAGER);
		obj3.setType(EmployeeAfterType.ENGINEER);
		Assert.assertEquals(210, obj1.payAmount());
		Assert.assertEquals(230, obj2.payAmount());
		Assert.assertEquals(200, obj3.payAmount());
	}
	public static void main(String[] args) {
		junit.textui.TestRunner.run(new TestSuite(ReplaceTypeCodeWithStateStrategyTester.class));
	}
}
