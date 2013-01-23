package kr.saeildamil.refact.encapsulate_collection;

public class Course {
	private String name;
	private boolean advanced;
	
	public Course(String name, boolean isAdvanced){
		this.name=name;
		this.advanced = isAdvanced;
	}
	
	public boolean isAdvanced(){
		return advanced;
	}
}
