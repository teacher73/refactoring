package kr.saeildamil.refact.encapsulate_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class EncapsulationTester extends TestCase {
	public EncapsulationTester(String name){
		super(name);
	}
	
	public void testEncap(){
		Person kent = new Person();
		Set<Course> s = new HashSet<>();
		s.add(new Course("java", false));
		s.add(new Course("Android", true));
		kent.setCourses(s);
		Assert.assertEquals (2, kent.getCourses().size());
		
		Course refact = new Course("리팩토링", true);
		kent.getCourses().add(refact);
		kent.getCourses().add(new Course("uml", false));
		Assert.assertEquals (4, kent.getCourses().size());
		
		kent.getCourses().remove(refact);
		Assert.assertEquals (3, kent.getCourses().size());

		testAdvanced(kent);
	}

	public void testAdvanced(Person person){
		Iterator<Course> iterator = person.getCourses().iterator();
		int count=1;
		while(iterator.hasNext()){
			Course each = iterator.next();
			if (each.isAdvanced()) count ++;
		}
		assertEquals(2, count);
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(new TestSuite(EncapsulationTester.class));
	}
}
