package kr.saeildamil.refact.substitute_algorithm;

import java.util.Arrays;
import java.util.List;

public class PersonList_after {
	String[] people = {"Don","John", "Kent"};
	
	String foundPerson(String[] people){
		List<String> candidates = Arrays.asList(new String[]{"Don","John", "Kent"});
		for(int i=0; i<people.length; i++){
			if (candidates.contains(people[i]))
				return people[i];
		}
		return "";
	}
	
	
}
