package kr.saeildamil.refact.replace_type_code_with_subclasses;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SubclassTester extends TestCase {
	public SubclassTester(String name){
		super(name);
	}
	
	public void testSubclass(){
		Employee obj1 = Employee.create(Employee.ENGINEER);
		Employee obj2 = Employee.create(Employee.SALESMAN);
		Employee obj3 = Employee.create(Employee.MANAGER);
		
		Assert.assertEquals("Object1 Type ", Employee.ENGINEER, obj1.getType());
		Assert.assertEquals("Object2 Type ", Employee.SALESMAN, obj2.getType());
		Assert.assertEquals("Object3 Type ", Employee.MANAGER, obj3.getType());
	}
	
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(new TestSuite(SubclassTester.class));
	}
}
