package kr.saeildamil.refact.hide_delegate;

public class TestDriver {
	public static void main(String[] args) {
		//Before
		
		/*Person_Before mgn = new Person_Before("Kim");
		Person_Before john = new Person_Before("john");
		
		Department_Before dpt = new Department_Before(mgn);
		john.set_department(dpt);
		
		System.out.println("John이 속해 있는 부서의 팀장은 " + john.get_department().get_manager());*/
		
		//After
		Person_After mgn = new Person_After("Kim");
		Person_After john = new Person_After("john");
		
		Department_After dpt = new Department_After(mgn);
		john.set_department(dpt);
		
		System.out.println("John이 속해 있는 부서의 팀장은 " + john.getManager());

	}
}
