package kr.saeildamil.refact.substitute_algorithm;

public class PersonList_before {
	String[] people = {"Don","John", "Kent"};
	
	String foundPerson(String[] people){
		for(int i=0; i<people.length; i++){
			if (people[i].equals("Don"))
				return "Don";
			if (people[i].equals("John"))
				return "John";
			if (people[i].equals("Kent"))
				return "Kent";
		}
		return "";
	}
}
